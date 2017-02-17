package com.study.pack.config;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ServletComponentScan
public class WebConfig {

	
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		Collection<String> urlPatterns = new ArrayList<>();
		urlPatterns.add("/*");
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
		registrationBean.setFilter(struts);
		registrationBean.setName("strutsFilter");
		registrationBean.setOrder(1);
		registrationBean.setUrlPatterns(urlPatterns);
		return registrationBean;
	}
}
