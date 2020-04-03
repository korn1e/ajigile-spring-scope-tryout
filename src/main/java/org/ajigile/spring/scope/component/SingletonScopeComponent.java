package org.ajigile.spring.scope.component;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Lazy // to enable lazy initiation, definition must be enabled in 2 places: @Component and @Autowired
@Component
public class SingletonScopeComponent {

	private String data1;
	private String data2;
	
	public SingletonScopeComponent() {
		System.out.println("-------------------------------SingletonScopeComponent initialized");
	}

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	
	
	
	
}
