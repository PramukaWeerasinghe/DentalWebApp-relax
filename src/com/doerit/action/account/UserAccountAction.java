package com.doerit.action.account;

import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.SessionHolder;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.UserAccount;
import com.doerit.model.ActivityLogger.MessageType;
import com.doerit.model.Department;
import com.doerit.model.Employee;
import com.doerit.service.DepartmentService;
import com.doerit.service.EmployeeService;
import com.doerit.service.UserAccountService;
import com.doerit.util.State;

import java.util.UUID;

import net.sourceforge.jtds.jdbc.DateTime;

public class UserAccountAction extends AbstractManagementAction {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(UserAccountAction.class);

	@Autowired
	private UserAccountService userAccountService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	DepartmentService departmentService;

	private Employee employee;
	private UserAccount userAccount;
	private List<UserAccount> userAccounts;

	private DateTime activateDatetimeType;
	private DateTime terminateDatetimeType;

	int updated = 0;

	/*
	 * public String list() { userAccounts = userAccountService.viewAllActive();
	 * logger.info("view user accounts"); return SUCCESS; }
	 */

	public String list() {
		try {
			beforeAction();
			pager = userAccountService.viewAllByPagerAndStatus(pager, State.ACTIVE.getDatabaseValue());
			pager.setSize(10);
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur " + e.getMessage());
			logger.info("view user accounts");
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String view() {

		if (getId() != null) {
			userAccount = userAccountService.viewById(getId());

			if (userAccount != null && userAccount.getRelationId() != null) {
				String foriegnKey = userAccount.getRelationId();
				employee = employeeService.viewById(foriegnKey);

				if (employee.getId() != null) {
					return SUCCESS;
				} else {
					return INPUT;
				}

			} else {
				return INPUT;
			}

		} else {
			addActionError("Invalid access");
			return INPUT;
		}

	}

	public String form() {

		return SUCCESS;
	}

	public String edit() {

		return view();
	}

	public String save() {

		if (employee != null || !employee.getId().isEmpty()) {

			if (isUserNameValid(userAccount.getUserName() )) {

				addEmployee(employee);

				if (updated == 1) {
					userAccount.setId(generatePrimaryKey());
					userAccount.setUserPassword(generateUserPasswordString());
					userAccount.setStatus(State.ACTIVE.getDatabaseValue());
					// userAccount.setCategoryRelationId("doctor");
					userAccount.setRelationId(employee.getId());
					userAccountService.save(userAccount);

					addLoggerMessage("tbl_useraccount", MessageType.NEW_USER_ADDED.toString(), "SUCCESS",
							"UserId: " + userAccount.getId() + ServletActionContext.getRequest().getRemoteHost());
					addActionMessage("user account created");

					return SUCCESS;
				} else {

					return INPUT;
				}

			} else {
				addActionMessage("invalid user name or existing details");
				return INPUT;
			}

		} else {
			addActionMessage("invalid employee details");
			return INPUT;

		}

	}

	protected boolean isUserNameValid(String name) {

		if (name.length() < 4) {

			return false;

		} else {
			return true;

		}

	}

	public void addEmployee(Employee employee) {
		employee.setId(generatePrimaryKey());
		employee.setStatus(State.ACTIVE.getDatabaseValue());
		employee.getInsertUserId();
		addInsertSettings(employee);
		employeeService.save(employee);
		updated = 1;
	}

	// generate user password
	public static String generateUserPasswordString() {
		String uuid = UUID.randomUUID().toString().toUpperCase();
		return uuid.substring(0, 5);
	}

	/*
	 * public String save() {
	 * 
	 * if (employee.getId() != null && userAccount.getId() != null) {
	 * System.out.println("emp: " + employee); System.out.println("user"+
	 * userAccount); try { employee.setId(generatePrimaryKey());
	 * employee.setStatus(State.ACTIVE.getDatabaseValue());
	 * 
	 * userAccount.setId(generatePrimaryKey());
	 * userAccount.setRelationId(employee.getId());
	 * userAccount.setActivateDatetime(activateDatetimeType.toTimestamp());
	 * userAccount.setTerminateDatetime(terminateDatetimeType.toTimestamp());
	 * userAccount.setStatus(State.ACTIVE.getDatabaseValue());
	 * 
	 * int updated = employeeService.save(employee);
	 * 
	 * if (updated == 1) { userAccountService.save(userAccount); } else {
	 * addActionError(ERROR + " did not add user"); return INPUT; }
	 * 
	 * addLoggerMessage("tbl_user_account and tbl_employee",
	 * MessageType.NEW_USER_ADDED.toString(), "SUCCESS", "UserId: " +
	 * userAccount.getId() + ServletActionContext.getRequest().getRemoteHost());
	 * addActionMessage("user account created"); return SUCCESS; } catch (Exception
	 * e) { e.printStackTrace(); return INPUT; } } else { return INPUT; }
	 * 
	 * 
	 * }
	 */

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public List<UserAccount> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(List<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}

	public List<Department> getDepartments() {
		return departmentService.viewAll();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public DateTime getActivateDatetimeType() {
		return activateDatetimeType;
	}

	public void setActivateDatetimeType(DateTime activateDatetimeType) {
		this.activateDatetimeType = activateDatetimeType;
	}

	public DateTime getTerminateDatetimeType() {
		return terminateDatetimeType;
	}

	public void setTerminateDatetimeType(DateTime terminateDatetimeType) {
		this.terminateDatetimeType = terminateDatetimeType;
	}

}
