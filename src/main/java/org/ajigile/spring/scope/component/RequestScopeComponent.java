package org.ajigile.spring.scope.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestScopeComponent {

	private String reqData1;
	private String reqData2;
	
	public RequestScopeComponent() {
		System.out.println("-------------------------------RequestScopeComponent initialized");
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
