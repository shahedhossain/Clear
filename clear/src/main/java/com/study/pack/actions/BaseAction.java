package com.study.pack.actions;

import java.io.Serializable;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
@ParentPackage("default")
@Namespace("/")
@ResultPath("/WEB-INF/jsp")
public class BaseAction extends ActionSupport implements Serializable{

}
