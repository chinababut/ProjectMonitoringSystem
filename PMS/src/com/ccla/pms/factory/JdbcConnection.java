package com.ccla.pms.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;



public class JdbcConnection implements ConnectionFactory {
	static Properties props = null;

	static {
		ResourceBundle bundle = null;

		Set<String> keys = null;

		bundle = ResourceBundle.getBundle("com/ccla/pms/commons/jdbc");
		props = new Properties();
		keys = bundle.keySet();

		for (String key : keys) {
			props.put(key, bundle.getString(key));
		}

	}

	@Override
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection conn = null;

		

			Class.forName(props.getProperty("jdbc.driver"));
			conn = DriverManager.getConnection(props.getProperty("jdbc.url"), props.getProperty("jdbc.userid"),props.getProperty("jdbc.password"));

		

		return conn;
	}

}
