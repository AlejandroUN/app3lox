package com.app3lox.utils;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Commons {
	
	public static DataSource getDS()  throws NamingException {
		InitialContext cxt = new InitialContext();		
		DataSource ds = (DataSource) cxt.lookup( "java:/comp/env/jdbc/game" );
		return ds;
	}
}
