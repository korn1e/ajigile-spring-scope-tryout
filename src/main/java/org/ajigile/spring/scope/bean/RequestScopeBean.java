package org.ajigile.spring.scope.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


public class RequestScopeBean {

	private String reqData1;
	private String reqData2;
	
	public RequestScopeBean() {
		System.out.println("-------------------------------RequestScopeBean initialized");
	}
	
	public RequestScopeBean(String s) {
		System.out.println("-------------------------------RequestScopeBean initialized (using resource)");
	}

	public String getReqData1() {
		return reqData1;
	}

	public void setReqData1(String reqData1) {
		this.reqData1 = reqData1;
	}

	public String getReqData2() {
		return reqData2;
	}

	public void setReqData2(String reqData2) {
		this.reqData2 = reqData2;
	}
	
	
	
}
