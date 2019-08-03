package com.doerit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.UserAccountMapper;
import com.doerit.model.UserAccount;
import com.doerit.util.Pager;
import com.doerit.util.State;

@Service
public class UserAccountService {

	@Autowired
	private UserAccountMapper userAccountMapper;
	
	public List<UserAccount> viewAllActive() {
		return userAccountMapper.findByState(State.ACTIVE.getDatabaseValue());
	}
	
	public List<UserAccount> viewAllInactive() {
		return userAccountMapper.findByState(State.DELETED.getDatabaseValue());
	}

	public UserAccount viewById(String id) {
		return userAccountMapper.selectByPrimaryKey(id);
	}
	
	public int save(UserAccount u) {
		return userAccountMapper.insert(u);
	}
	
	public UserAccount viewByEmailAndPassword(String email, String password) {
		return userAccountMapper.findByEmailPasswordAndState(email, password, State.ACTIVE.getDatabaseValue());
	}

	public Pager viewAllByPagerAndStatus(Pager p, byte state) {
		p.setList(userAccountMapper.viewAllByStatus(p, state));
		p.setTotal(userAccountMapper.countAllByStatus(state));
		
		return p;
	}
	
}
