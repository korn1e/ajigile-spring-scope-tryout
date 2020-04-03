package org.ajigile.spring.scope.controller;

import javax.annotation.Resource;

import org.ajigile.spring.scope.bean.RequestScopeBean;
import org.ajigile.spring.scope.bean.SessionScopeBean;
import org.ajigile.spring.scope.bean.SingletonScopeBean;
import org.ajigile.spring.scope.component.RequestScopeComponent;
import org.ajigile.spring.scope.component.SessionScopeComponent;
import org.ajigile.spring.scope.component.SingletonScopeComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjigileController {

//	@Resource(name = "getRequestScopeBean") // resource name must match with the method name under configuration
//	private RequestScopeBean requestScopeBeanRes;
//	
//	@Resource(name = "getSessionScopeBean") // resource name must match with the method name under configuration
//	private SessionScopeBean sessionScopeBeanRes;
	
	
	@Autowired
	private RequestScopeBean requestScopeBeanX;
	
	@Autowired
	private SessionScopeBean sessionScopeBeanX;
	
	//@Lazy // to enable lazy initiation, definition must be enabled in 2 places: @Bean and @Autowired
	@Autowired
	private SingletonScopeBean singletonScopeBeanX;
	
	
	
	@Autowired
	private RequestScopeComponent requestScopeComponent;
	
	@Autowired
	private SessionScopeComponent sessionScopeComponent;
	
	@Lazy // to enable lazy initiation, definition must be enabled in 2 places: @Component and @Autowired
	@Autowired
	private SingletonScopeComponent singletonScopeComponent;
	
	
	
	
	@GetMapping("/ajigile")
	public @ResponseBody String ajigile(@RequestParam String data1, @RequestParam String data2) {
		sessionScopeBeanX.setSesData1(data1);
		sessionScopeBeanX.setSesData2(data2);
		
		requestScopeBeanX.setReqData1(data1);
		requestScopeBeanX.setReqData2(data2);
		
		singletonScopeBeanX.setData1(data1);
		singletonScopeBeanX.setData2(data2);
		
		
		sessionScopeComponent.setSesData1(data1);
		requestScopeComponent.setReqData1(data1);
		singletonScopeComponent.setData1(data1);
		
		
		
		return "OK";
	}
	
}
