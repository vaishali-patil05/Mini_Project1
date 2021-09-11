package com.controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.Model.Book;
import com.Model.Book_Issue_Register;
import com.Model.Member;
import com.dao.Authordao;
import com.dao.Book_Issue_Register_dao;
import com.dao.Bookdao;
import com.dao.Memberdao;

public class Main_Entry {

	public static void main(String[] args) throws SQLException, ParseException {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("**************Welcome Libray System*************");
			do {
				System.out.println("1--->Add Book \n2--->Remove Book  \n3--->Update Book  \n4--->Search Book  "
						+ "\n5--->Add New Member \n6--->Remove Member  \n7--->Update Member details \n8--->Issue Book to Member "
						+ "\n9--->Record returned book from member \n10--->Exit");

				System.out.println("Enter your choice");
				int choice = 0;
				if (scanner.hasNextInt()) {
					choice = scanner.nextInt();
				}
				switch (choice)

				{

				case 1:
					System.out.println("Enter Book_Id :");
					int id = scanner.nextInt();
					System.out.println("Enter Book_Name :");
					String nm = scanner.next();
					System.out.println("Enter Book Price :");
					int price = scanner.nextInt();
					System.out.println("Enter Author Id :");
					int aid = scanner.nextInt();
					System.out.println("Enter Category Id :");
					int cid = scanner.nextInt();
					Book obj = new Book(id, nm, price, aid, cid);
					Bookdao.insertBook(obj);
					System.out.println("Record Added Successfully");
					break;

				case 2:
					System.out.println("enter name to delete");
					String cid1 = scanner.next();
					Bookdao.deleteBook(cid1);
					System.out.println("Record Deleted Successfully");
					break;

				case 3:
					System.out.println("Enter price :");
					int price1 = scanner.nextInt();
					System.out.println("Enter Book Id :");
					int book_id = scanner.nextInt();
					Bookdao.updatePrice(price1, book_id);
					System.out.println("Record Update Successfully");
					break;

				case 4:
					List<Book> clist = Bookdao.searchBook();
					for (Book cc : clist)
						System.out.println(cc.getBook_name() + " " + cc.getAuthor_id() + " " + cc.getCategory_id());
					System.out.println("Search record Successuffly");
					break;

				case 5:
					System.out.println("enter Member_id,name,address,email,mobile:");
					int Member_id = scanner.nextInt();
					String Member_name = scanner.next();
					String address = scanner.next();
					String emailid = scanner.next();
					Long mobile = scanner.nextLong();
					Member MemberObj = new Member(Member_id, Member_name, address, emailid, mobile);
					Memberdao.insertMember(MemberObj);
					System.out.println("Record Added Successfully");
					break;

				case 6:
					System.out.println("enter id to delete");
					int cid2 = scanner.nextInt();
					Memberdao.deleteMember(cid2);
					System.out.println("Record deleted successfully");
					break;

				case 7:
					System.out.println("Enter Member_id:");
					int Member = scanner.nextInt();
					System.out.println("Enter Member Name :");
					String name = scanner.next();
					Authordao.updateAuthor(Member, name);
					System.out.println("Update Successfully");
					break;

				case 8:
					System.out.println("Enter Issue id");
					int Issue_id = scanner.nextInt();
					System.out.println("Enter Issue Date");
					String issue_date = scanner.next();
					System.out.println("Enter Return Date");
					String return_date = scanner.next();
					System.out.println("Enter Fine");
					int fine = scanner.nextInt();
					System.out.println("Enter book is return or not");
					String isReturn = scanner.next();
					System.out.println("Enter Book Id");
					int bookid = scanner.nextInt();
					System.out.println("Enter Member Id");
					int Memberid = scanner.nextInt();

					Book_Issue_Register obj1 = new Book_Issue_Register(Issue_id, issue_date, return_date, fine,
							isReturn, bookid, Memberid);
					Book_Issue_Register_dao.IuuseBookToMember(obj1);
					System.out.println("Record Added Successfully");
					break;

				case 9:
					System.out.println("Enter Member Id :");
					int Member_Id = scanner.nextInt();
					Book_Issue_Register_dao.RecordOfBook(Member_Id);
					System.out.println("Record Display Successfully");
					break;

				}

				if (choice == 10)
					break;

			} while (true);
		}
		System.out.println("Thanks !!");

	}

}
