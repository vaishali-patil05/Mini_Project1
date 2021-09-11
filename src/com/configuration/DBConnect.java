package com.configuration;



import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class DBConnect {
	static final String driver = "com.mysql.cj.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/just_library";
	static final String user = "root";
	static final String password = "Patil321???";

	public static Connection getConnection() {

		Connection con = null;
		try {
			con = (Connection) DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return con;

	}

}