package com.Model;

public class Member {
	
	private int Member_id;
	private String Member_Name;
	private String address;
	private String emailId;
	private long mobile;
	public Member(int member_id, String member_Name, String address, String emailId, long mobile) {
		super();
		Member_id = member_id;
		Member_Name = member_Name;
		this.address = address;
		this.emailId = emailId;
		this.mobile = mobile;
	}
	public Member() {
	
	}
	public Member(int id, String nm, String category, int price) {
		
	}
	public int getMember_id() {
		return Member_id;
	}
	public void setMember_id(int member_id) {
		Member_id = member_id;
	}
	public String getMember_Name() {
		return Member_Name;
	}
	public void setMember_Name(String member_Name) {
		Member_Name = member_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Member [Member_id=" + Member_id + ", Member_Name=" + Member_Name + ", address=" + address + ", emailId="
				+ emailId + ", mobile=" + mobile + "]";
	}
	
	
	

}
