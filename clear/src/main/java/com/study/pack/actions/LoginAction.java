package com.study.pack.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Component;

@Component
public class LoginAction extends BaseAction {
 
    private static final long serialVersionUID = 1L;
     
    @Action(value = "come", results = { @Result(name = "success", location = "login.jsp") })
    @SuppressWarnings("unchecked")
    public String execute() throws Exception {
        return SUCCESS;
    }
}