package com.learnings.prototype;

public class Client {
	
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		Connection conn= new Connection();
		conn.setIp("10.10.10");
		try {
			conn.loadData();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(conn.hashCode()+" "+ System.currentTimeMillis());
		System.out.println(conn);
		
		
		Connection conn1= (Connection)conn.clone();
		//System.out.println(conn1.hashCode()+" "+ System.currentTimeMillis());
		System.out.println(conn1);
		
		conn.getDomains().remove(0);
		
		System.out.println(conn);
		
		System.out.println(conn1);
		
		System.out.println(conn.hashCode());
		
		System.out.println(conn1.hashCode());
		
	}

}
