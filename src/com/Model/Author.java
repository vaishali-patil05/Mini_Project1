package com.Model;

public class Author {
	private int Author_id;
	private String author_name;

	public Author(int author_id, String author_name) {
		super();
		Author_id = author_id;
		this.author_name = author_name;
	}

	public Author(int author_id2) {

	}

	public Author() {

	}

	public int getAuthor_id() {
		return Author_id;
	}

	public void setAuthor_id(int author_id) {
		Author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	@Override
	public String toString() {
		return "Author [Author_id=" + Author_id + ", author_name=" + author_name + "]";
	}

}
