package org.ajigile.spring.scope;

import org.ajigile.spring.scope.bean.RequestScopeBean;
import org.ajigile.spring.scope.bean.SessionScopeBean;
import org.ajigile.spring.scope.bean.SingletonScopeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class AjigileConfiguration {

	@Bean
	@RequestScope
	public RequestScopeBean getRequestScopeBean() { 
		return new RequestScopeBean();
	}
	
	@Bean
	@SessionScope
	public SessionScopeBean getSessionScopeBean() { 
		return new SessionScopeBean();
	}
	
	
	//@Lazy // to enable lazy initiation, definition must be enabled in 2 places: @Bean and @Autowired 
	@Bean
	public SingletonScopeBean getSingletonScopeBean() { 
		return new SingletonScopeBean();
	}
	
	// should not
}
