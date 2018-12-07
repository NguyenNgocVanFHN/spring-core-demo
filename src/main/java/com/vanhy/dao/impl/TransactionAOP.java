package com.vanhy.dao.impl;

import org.hibernate.Session;
public class TransactionAOP {
	
	public void beginTx() {
		System.out.println("Begin Transaction");
	}
	
	public void commitTx() {
		System.out.println("Commit");
	}
	
	public void rollbackTx() {
		System.out.println("rollback");
	}
}
