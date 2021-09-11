package com.Model;



public class Book_Issue_Register {
	private int IssueId;
	private String return_date;
	private String Issue_date;
	private int fine;
	private String isReturned;
	private int Book_id;
	private int Member_Id;

	public Book_Issue_Register(int issueId, String issue_date2, String return_date2, int fine, String isReturned,int book_id, int member_Id) {
		super();
		IssueId = issueId;
		this.return_date = issue_date2;
		Issue_date = return_date2;
		this.fine = fine;
		this.isReturned = isReturned;
		Book_id = book_id;
		Member_Id = member_Id;
	}

	public Book_Issue_Register() {

	}

	public Book_Issue_Register(int member_id1) {

	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public int getMember_Id() {
		return Member_Id;
	}

	public void setMember_Id(int member_Id) {
		Member_Id = member_Id;
	}

	public int getIssueId() {
		return IssueId;
	}

	public void setIssueId(int issueId) {
		IssueId = issueId;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public String getIssue_date() {
		return Issue_date;
	}

	public void setIssue_date(String issue_date) {
		Issue_date = issue_date;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public String getIsReturned() {
		return isReturned;
	}

	public void setIsReturned(String isReturned) {
		this.isReturned = isReturned;
	}

	@Override
	public String toString() {
		return "Book_Issue_Register [IssueId=" + IssueId + ", return_date=" + return_date + ", Issue_date=" + Issue_date
				+ ", fine=" + fine + ", isReturned=" + isReturned + ", Book_id=" + Book_id + ", Member_Id=" + Member_Id
				+ "]";
	}

}
