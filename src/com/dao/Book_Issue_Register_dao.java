package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Model.Book_Issue_Register;
import com.configuration.DBConnect;

public class Book_Issue_Register_dao {

	public static boolean IuuseBookToMember(Book_Issue_Register b) throws SQLException {
		String sql = "insert into Book_Issue_Register  values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
			ps.setInt(1, b.getIssueId());
			ps.setString(2, b.getIssue_date());
			ps.setString(3, b.getReturn_date());
			ps.setInt(4, b.getFine());
			ps.setString(5, b.getIsReturned());
			ps.setInt(6, b.getBook_id());
			ps.setInt(7, b.getMember_Id());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

	public static Book_Issue_Register RecordOfBook(int Member_id) throws SQLException {

		Book_Issue_Register ob = null;
		String sql = "select * from Book_Issue_Register where member_id=?";

		PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
		ps.setInt(1, Member_id);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			ob = new Book_Issue_Register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
					rs.getInt(6), rs.getInt(7));
			System.out.println(ob);
		}

		return ob;

	}
	
}
