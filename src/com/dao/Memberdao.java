package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.Model.Member;
import com.configuration.DBConnect;

public class Memberdao {

	public static boolean insertMember(Member m) throws SQLException {

		String sql = "Insert into Member values(?,?,?,?,?)";
		try {
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
			ps.setInt(1, m.getMember_id());
			ps.setString(2, m.getMember_Name());
			ps.setString(3, m.getAddress());
			ps.setString(4, m.getEmailId());
			ps.setLong(5, m.getMobile());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

	public static boolean deleteMember(int Member_id) throws SQLException {
		String sql = "delete from Member where member_id=?";
		try {
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
			ps.setInt(1, Member_id);

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
