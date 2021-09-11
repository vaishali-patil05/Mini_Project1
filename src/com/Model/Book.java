package com.Model;

public class Book {

	private int Book_Id;
	private String book_name;
	private int price;
	private int Author_id;
	private int category_id;

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public Book(int book_Id, String book_name, int price, int author_id, int category_id) {
		super();
		Book_Id = book_Id;
		this.book_name = book_name;
		this.price = price;
		Author_id = author_id;
		this.category_id = category_id;
	}

	public Book() {
		
	}

	public Book(int id, String nm, int price2, String category) {

	}

	public int getBook_Id() {
		return Book_Id;
	}

	public void setBook_Id(int bid) {
		Book_Id = bid;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Book_Id=" + Book_Id + ", book_name=" + book_name + ", price=" + price + ", Author_id=" + Author_id
				+ ", category_id=" + category_id + "]";
	}

	public int getAuthor_id() {
		return Author_id;
	}

	public void setAuthor_id(int author_id) {
		Author_id = author_id;
	}

}
