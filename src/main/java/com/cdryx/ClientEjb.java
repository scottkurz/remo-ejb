package com.cdryx;

import java.io.Serializable;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(IClientService.class)
public class ClientEjb implements IClientService, Serializable {

	private static final long serialVersionUID = -1L;

	public String doSomething() {
		return "hello world";
	}

}
