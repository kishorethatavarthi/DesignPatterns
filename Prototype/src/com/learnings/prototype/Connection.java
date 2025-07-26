package com.learnings.prototype;

import java.util.ArrayList;
import java.util.List;

public class Connection implements Cloneable {
	
	private String ip;
	
	private String data;
	
	private List<String> domains = new ArrayList();

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void loadData() throws InterruptedException {
		this.data = "this will take time";
		domains.add("www.google.com");
		domains.add("www.fb.com");
		Thread.sleep(2000);
	}

	
	
	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	
	

	@Override
	public String toString() {
		return "Connection [ip=" + ip + ", data=" + data + ", domains=" + domains + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		Connection connection = new Connection();
		connection.setIp(this.getIp());
		connection.setData(this.getData());
		for(String d:domains) {
			connection.getDomains().add(d);
		}
		return connection;
	}
	
	

}
