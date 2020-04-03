package org.ajigile.spring.scope.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;


public class SessionScopeBean {

	private String sesData1;
	private String sesData2;
	
	public SessionScopeBean() {
		System.out.println("-------------------------------SessionScopeBean initialized");
	}
	
	public SessionScopeBean(String s) {
		System.out.println("-------------------------------SessionScopeBean initialized (using resource)");
	}

	public String getSesData1() {
		return sesData1;
	}

	public void setSesData1(String sesData1) {
		this.sesData1 = sesData1;
	}

	public String getSesData2() {
		return sesData2;
	}

	public void setSesData2(String sesData2) {
		this.sesData2 = sesData2;
	}
	
	
	
}
