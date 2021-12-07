package com.app3lox.dao;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.app3lox.utils.Commons;

import comp.app3lox.models.Game;

//To interact with the database
public class GameDao {
	
	private DataSource ds;
	private QueryRunner qr;
	private static GameDao dao;
	
	public GameDao() throws NamingException {
		this.ds = Commons.getDS();
		this.qr = new QueryRunner(ds);
	}
	
	public static GameDao getInstance() throws NamingException {
		if(dao == null) {
			dao = new GameDao();
		}
		return dao;
	}
	
	public int insert(Game game) {
		int result = 0;
	
		return result;
	}
}
