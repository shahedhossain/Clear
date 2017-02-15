package com.kyra.pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClearApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ClearApplication.class, args);
	}
	
	@Bean
    public FilterRegistrationBean filterRegistrationBean() {
		Collection<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");
        Map<String,String> initParams = new HashMap<String,String>();
        initParams.put("actionPackages","com.kyra.pack.action");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.setOrder(1);
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.setInitParameters(initParams);
        return registrationBean;
    }
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ClearApplication.class);
    }
}
