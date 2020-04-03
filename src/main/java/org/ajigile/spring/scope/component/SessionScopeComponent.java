package org.ajigile.spring.scope.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionScopeComponent {

	private String sesData1;
	private String sesData2;
	
	public SessionScopeComponent() {
		System.out.println("-------------------------------SessionScopeComponent initialized");
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
