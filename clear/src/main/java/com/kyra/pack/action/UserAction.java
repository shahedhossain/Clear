package com.kyra.pack.action;



import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class UserAction extends ActionSupport {
 
    private static final long serialVersionUID = 1L;
     
   /* @SuppressWarnings("unchecked")
    public String execute() throws Exception {
        return SUCCESS;
    }*/
    
    @Action(value = "users" ,
            results = { @Result(name = "success" , location ="users.jsp") })
    @SkipValidation
    public String execute() throws Exception {
        return SUCCESS;
    }
}
