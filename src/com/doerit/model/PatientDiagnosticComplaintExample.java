package com.doerit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientDiagnosticComplaintExample {
   
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;
	
	public PatientDiagnosticComplaintExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	
	public String getOrderByClause() {
		return orderByClause;
	}

	
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}
	
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}
	
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}
	
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("ID like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("ID not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andPatientIdIsNull() {
			addCriterion("PATIENT_ID is null");
			return (Criteria) this;
		}

		public Criteria andPatientIdIsNotNull() {
			addCriterion("PATIENT_ID is not null");
			return (Criteria) this;
		}

		public Criteria andPatientIdEqualTo(String value) {
			addCriterion("PATIENT_ID =", value, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdNotEqualTo(String value) {
			addCriterion("PATIENT_ID <>", value, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdGreaterThan(String value) {
			addCriterion("PATIENT_ID >", value, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
			addCriterion("PATIENT_ID >=", value, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdLessThan(String value) {
			addCriterion("PATIENT_ID <", value, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdLessThanOrEqualTo(String value) {
			addCriterion("PATIENT_ID <=", value, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdLike(String value) {
			addCriterion("PATIENT_ID like", value, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdNotLike(String value) {
			addCriterion("PATIENT_ID not like", value, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdIn(List<String> values) {
			addCriterion("PATIENT_ID in", values, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdNotIn(List<String> values) {
			addCriterion("PATIENT_ID not in", values, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdBetween(String value1, String value2) {
			addCriterion("PATIENT_ID between", value1, value2, "patientId");
			return (Criteria) this;
		}

		public Criteria andPatientIdNotBetween(String value1, String value2) {
			addCriterion("PATIENT_ID not between", value1, value2, "patientId");
			return (Criteria) this;
		}
		

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNull() {
            addCriterion("SUPERVISOR is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNotNull() {
            addCriterion("SUPERVISOR is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorEqualTo(String value) {
            addCriterion("SUPERVISOR =", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotEqualTo(String value) {
            addCriterion("SUPERVISOR <>", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThan(String value) {
            addCriterion("SUPERVISOR >", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERVISOR >=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThan(String value) {
            addCriterion("SUPERVISOR <", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThanOrEqualTo(String value) {
            addCriterion("SUPERVISOR <=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLike(String value) {
            addCriterion("SUPERVISOR like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotLike(String value) {
            addCriterion("SUPERVISOR not like", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorIn(List<String> values) {
            addCriterion("SUPERVISOR in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotIn(List<String> values) {
            addCriterion("SUPERVISOR not in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorBetween(String value1, String value2) {
            addCriterion("SUPERVISOR between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotBetween(String value1, String value2) {
            addCriterion("SUPERVISOR not between", value1, value2, "supervisor");
            return (Criteria) this;
        }

		public Criteria andComplaintIsNull() {
			addCriterion("COMPLAINT is null");
			return (Criteria) this;
		}

		public Criteria andComplaintIsNotNull() {
			addCriterion("COMPLAINT is not null");
			return (Criteria) this;
		}

		public Criteria andComplaintEqualTo(String value) {
			addCriterion("COMPLAINT =", value, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintNotEqualTo(String value) {
			addCriterion("COMPLAINT <>", value, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintGreaterThan(String value) {
			addCriterion("COMPLAINT >", value, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintGreaterThanOrEqualTo(String value) {
			addCriterion("COMPLAINT >=", value, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintLessThan(String value) {
			addCriterion("COMPLAINT <", value, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintLessThanOrEqualTo(String value) {
			addCriterion("COMPLAINT <=", value, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintLike(String value) {
			addCriterion("COMPLAINT like", value, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintNotLike(String value) {
			addCriterion("COMPLAINT not like", value, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintIn(List<String> values) {
			addCriterion("COMPLAINT in", values, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintNotIn(List<String> values) {
			addCriterion("COMPLAINT not in", values, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintBetween(String value1, String value2) {
			addCriterion("COMPLAINT between", value1, value2, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintNotBetween(String value1, String value2) {
			addCriterion("COMPLAINT not between", value1, value2, "complaint");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeIsNull() {
			addCriterion("COMPLAINT_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeIsNotNull() {
			addCriterion("COMPLAINT_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeEqualTo(String value) {
			addCriterion("COMPLAINT_TYPE =", value, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeNotEqualTo(String value) {
			addCriterion("COMPLAINT_TYPE <>", value, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeGreaterThan(String value) {
			addCriterion("COMPLAINT_TYPE >", value, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeGreaterThanOrEqualTo(String value) {
			addCriterion("COMPLAINT_TYPE >=", value, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeLessThan(String value) {
			addCriterion("COMPLAINT_TYPE <", value, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeLessThanOrEqualTo(String value) {
			addCriterion("COMPLAINT_TYPE <=", value, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeLike(String value) {
			addCriterion("COMPLAINT_TYPE like", value, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeNotLike(String value) {
			addCriterion("COMPLAINT_TYPE not like", value, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeIn(List<String> values) {
			addCriterion("COMPLAINT_TYPE in", values, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeNotIn(List<String> values) {
			addCriterion("COMPLAINT_TYPE not in", values, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeBetween(String value1, String value2) {
			addCriterion("COMPLAINT_TYPE between", value1, value2, "complaintType");
			return (Criteria) this;
		}

		public Criteria andComplaintTypeNotBetween(String value1, String value2) {
			addCriterion("COMPLAINT_TYPE not between", value1, value2, "complaintType");
			return (Criteria) this;
		}

		public Criteria andCommentIsNull() {
			addCriterion("COMMENT is null");
			return (Criteria) this;
		}

		public Criteria andCommentIsNotNull() {
			addCriterion("COMMENT is not null");
			return (Criteria) this;
		}

		public Criteria andCommentEqualTo(String value) {
			addCriterion("COMMENT =", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotEqualTo(String value) {
			addCriterion("COMMENT <>", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentGreaterThan(String value) {
			addCriterion("COMMENT >", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentGreaterThanOrEqualTo(String value) {
			addCriterion("COMMENT >=", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLessThan(String value) {
			addCriterion("COMMENT <", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLessThanOrEqualTo(String value) {
			addCriterion("COMMENT <=", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentLike(String value) {
			addCriterion("COMMENT like", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotLike(String value) {
			addCriterion("COMMENT not like", value, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentIn(List<String> values) {
			addCriterion("COMMENT in", values, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotIn(List<String> values) {
			addCriterion("COMMENT not in", values, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentBetween(String value1, String value2) {
			addCriterion("COMMENT between", value1, value2, "comment");
			return (Criteria) this;
		}

		public Criteria andCommentNotBetween(String value1, String value2) {
			addCriterion("COMMENT not between", value1, value2, "comment");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("STATUS is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("STATUS is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Byte value) {
			addCriterion("STATUS =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Byte value) {
			addCriterion("STATUS <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Byte value) {
			addCriterion("STATUS >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
			addCriterion("STATUS >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Byte value) {
			addCriterion("STATUS <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Byte value) {
			addCriterion("STATUS <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Byte> values) {
			addCriterion("STATUS in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Byte> values) {
			addCriterion("STATUS not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Byte value1, Byte value2) {
			addCriterion("STATUS between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Byte value1, Byte value2) {
			addCriterion("STATUS not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andSortOrderIsNull() {
			addCriterion("SORT_ORDER is null");
			return (Criteria) this;
		}

		public Criteria andSortOrderIsNotNull() {
			addCriterion("SORT_ORDER is not null");
			return (Criteria) this;
		}

		public Criteria andSortOrderEqualTo(Integer value) {
			addCriterion("SORT_ORDER =", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderNotEqualTo(Integer value) {
			addCriterion("SORT_ORDER <>", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderGreaterThan(Integer value) {
			addCriterion("SORT_ORDER >", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("SORT_ORDER >=", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderLessThan(Integer value) {
			addCriterion("SORT_ORDER <", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
			addCriterion("SORT_ORDER <=", value, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderIn(List<Integer> values) {
			addCriterion("SORT_ORDER in", values, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderNotIn(List<Integer> values) {
			addCriterion("SORT_ORDER not in", values, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderBetween(Integer value1, Integer value2) {
			addCriterion("SORT_ORDER between", value1, value2, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("SORT_ORDER not between", value1, value2, "sortOrder");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdIsNull() {
			addCriterion("INSERT_USER_ID is null");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdIsNotNull() {
			addCriterion("INSERT_USER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdEqualTo(String value) {
			addCriterion("INSERT_USER_ID =", value, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdNotEqualTo(String value) {
			addCriterion("INSERT_USER_ID <>", value, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdGreaterThan(String value) {
			addCriterion("INSERT_USER_ID >", value, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("INSERT_USER_ID >=", value, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdLessThan(String value) {
			addCriterion("INSERT_USER_ID <", value, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdLessThanOrEqualTo(String value) {
			addCriterion("INSERT_USER_ID <=", value, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdLike(String value) {
			addCriterion("INSERT_USER_ID like", value, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdNotLike(String value) {
			addCriterion("INSERT_USER_ID not like", value, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdIn(List<String> values) {
			addCriterion("INSERT_USER_ID in", values, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdNotIn(List<String> values) {
			addCriterion("INSERT_USER_ID not in", values, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdBetween(String value1, String value2) {
			addCriterion("INSERT_USER_ID between", value1, value2, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertUserIdNotBetween(String value1, String value2) {
			addCriterion("INSERT_USER_ID not between", value1, value2, "insertUserId");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeIsNull() {
			addCriterion("INSERT_DATETIME is null");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeIsNotNull() {
			addCriterion("INSERT_DATETIME is not null");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeEqualTo(Date value) {
			addCriterion("INSERT_DATETIME =", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeNotEqualTo(Date value) {
			addCriterion("INSERT_DATETIME <>", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeGreaterThan(Date value) {
			addCriterion("INSERT_DATETIME >", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("INSERT_DATETIME >=", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeLessThan(Date value) {
			addCriterion("INSERT_DATETIME <", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeLessThanOrEqualTo(Date value) {
			addCriterion("INSERT_DATETIME <=", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeIn(List<Date> values) {
			addCriterion("INSERT_DATETIME in", values, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeNotIn(List<Date> values) {
			addCriterion("INSERT_DATETIME not in", values, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeBetween(Date value1, Date value2) {
			addCriterion("INSERT_DATETIME between", value1, value2, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeNotBetween(Date value1, Date value2) {
			addCriterion("INSERT_DATETIME not between", value1, value2, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdIsNull() {
			addCriterion("UPDATE_USER_ID is null");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdIsNotNull() {
			addCriterion("UPDATE_USER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdEqualTo(String value) {
			addCriterion("UPDATE_USER_ID =", value, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdNotEqualTo(String value) {
			addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdGreaterThan(String value) {
			addCriterion("UPDATE_USER_ID >", value, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdLessThan(String value) {
			addCriterion("UPDATE_USER_ID <", value, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
			addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdLike(String value) {
			addCriterion("UPDATE_USER_ID like", value, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdNotLike(String value) {
			addCriterion("UPDATE_USER_ID not like", value, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdIn(List<String> values) {
			addCriterion("UPDATE_USER_ID in", values, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdNotIn(List<String> values) {
			addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdBetween(String value1, String value2) {
			addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
			addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeIsNull() {
			addCriterion("UPDATE_DATETIME is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeIsNotNull() {
			addCriterion("UPDATE_DATETIME is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeEqualTo(Date value) {
			addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeNotEqualTo(Date value) {
			addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeGreaterThan(Date value) {
			addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeLessThan(Date value) {
			addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
			addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeIn(List<Date> values) {
			addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeNotIn(List<Date> values) {
			addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
			addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
			addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
			return (Criteria) this;
		}
	}

	
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}