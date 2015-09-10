package com.nirvana.action;

import com.opensymphony.xwork2.ActionSupport;

public class WildcardAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("execute method...");
		return SUCCESS;
	}
	
	public String add() {
		System.out.println("add method...");
		return SUCCESS;
	}

	public String create() {
		System.out.println("create method...");
		return SUCCESS;
	}
}
