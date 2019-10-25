package com.luv4boot.springcore.propertyplaceholder;

public class MyDAO {
	private String dbServer;
	private String dbUrl;

	public MyDAO(String dbServer, String dbUrl) {
		super();
		this.dbServer = dbServer;
		this.dbUrl = dbUrl;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbUrl=" + dbUrl + "]";
	}

}
