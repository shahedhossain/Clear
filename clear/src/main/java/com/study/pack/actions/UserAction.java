package com.study.pack.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Component;

import com.study.pack.model.User;

@Component
public class UserAction extends BaseAction{

	private static final long serialVersionUID = 1L;

	private List<User> userList;

	@Action(value = "welcome", results = { @Result(name = "success", location = "result.jsp") })
	public String execute() {
		return SUCCESS;
	}

	@Action(value = "users", results = { @Result(name = "success", type = "json", params = { "root", "userList" }) })
	public String users() {
		userList = new ArrayList<>();
		userList.add(new User("Carl", 15, "M"));
		userList.add(new User("Rick", 30, "M"));
		userList.add(new User("Michonne", 26, "F"));
		return SUCCESS;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}	
	
	
	
	

}
