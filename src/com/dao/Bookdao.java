package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.Model.Book;
import com.configuration.DBConnect;

public class Bookdao {

	public Bookdao() {

	}

	public static boolean insertBook(Book ob) throws SQLException {
		String sql = "insert into Book values(?,?,?,?,?)";
		try {
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
			ps.setInt(1, ob.getBook_Id());
			ps.setString(2, ob.getBook_name());
			ps.setInt(3, ob.getPrice());
			ps.setInt(4, ob.getAuthor_id());
			ps.setInt(5, ob.getCategory_id());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

	public static boolean deleteBook(String Book_name) throws SQLException {
		String sql = "delete from Book where Book_name=?";
		try {
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
			ps.setString(1, Book_name);

			return ps.executeUpdate() > 0;
		} catch (SQLException e)

		{
			e.printStackTrace();
		}

		return false;

	}

	public static boolean updatePrice(int price, int Book_Id) {
		String sql = "update Book set price=? where Book_Id=?";

		try {
			PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
			ps.setInt(1, price);
			ps.setInt(2, Book_Id);

			return ps.executeUpdate() > 0;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

	public static List<Book> searchBook() throws SQLException {
		List<Book> list = new ArrayList<Book>();
		String sql = "select book_name,author_id,category_id from book";
		PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Book a = new Book();

			a.setBook_name(rs.getString(1));
			a.setAuthor_id(rs.getInt(2));
			a.setCategory_id(rs.getInt(3));
			list.add(a);
		}
		return list;

	}

}
