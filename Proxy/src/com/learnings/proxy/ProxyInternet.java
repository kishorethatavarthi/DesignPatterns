package com.learnings.proxy;

import java.util.List;

public class ProxyInternet implements Internet{
	
	public List<String> restrictedDomains = List.of("abc","bcd");
	private RealInternet realInternet = new RealInternet();

	@Override
	public void connectTo(String domain) {
		if(restrictedDomains.contains(domain))
			throw new RuntimeException("Restricted Domain "+ domain);
		realInternet.connectTo(domain);
		
	}
	

}
