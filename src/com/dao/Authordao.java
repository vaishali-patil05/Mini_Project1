package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.configuration.DBConnect;

public class Authordao {

	public static boolean updateAuthor(int Author_id, String author_name) {
		String sql = "update Author set Author_Name=? where Author_Id=?";

		try {
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
			ps.setString(1, author_name);
			ps.setInt(2, Author_id);

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

}
