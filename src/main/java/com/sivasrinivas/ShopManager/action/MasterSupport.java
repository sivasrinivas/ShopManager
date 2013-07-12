package com.sivasrinivas.ShopManager.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action class which extends ActionSupport and provide addition utility methods for all the actions which extends this class
 * @author Siva
 *
 */
public class MasterSupport extends ActionSupport implements ApplicationAware, SessionAware, RequestAware{

	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application=application;
	}

}
