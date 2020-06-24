package com.ccla.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ccla.pms.factory.ConnectionFactory;
import com.ccla.pms.factory.JdbcConnection;

public class LoginCheckerDao {
	private static final String SELECTL_LOGGINQUERY = "SELECT USERID,PASSWORD from USERLOGIN";
	
	static {
		
	}
	
	public static ResultSet getLogins() throws ClassNotFoundException, SQLException {
		
		
		
		Connection conn = null;
		PreparedStatement ps = null;
		ConnectionFactory factory = null;
		ResultSet rs = null;
		
		factory = new JdbcConnection();
		conn = factory.getConnection();
		System.out.println(conn);
		ps = conn.prepareStatement(SELECTL_LOGGINQUERY);
		rs = ps.executeQuery();
		
		
		
		return rs;
		
		
	}

}
