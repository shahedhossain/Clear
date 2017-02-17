package com.study.pack;

import java.util.ArrayList;
import java.util.Collection;

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

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ClearApplication.class);
	}

	
     
}




/*
 * @Override public void onStartup(ServletContext servletContext) throws
 * ServletException { AnnotationConfigWebApplicationContext appContext = new
 * AnnotationConfigWebApplicationContext();
 * appContext.register(ApplicationContextConfig.class);
 * 
 * ContextLoaderListener contextLoaderListener = new
 * ContextLoaderListener(appContext);
 * servletContext.addListener(contextLoaderListener);
 * 
 * FilterRegistration.Dynamic filter = servletContext.addFilter(
 * "StrutsDispatcher", new StrutsPrepareAndExecuteFilter());
 * filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true,
 * "/*"); }
 */