package com.ezen.biz;


public class Board1 {

	private Long seq;
	private String name;
	private String email;
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Board1 [seq=" + seq + ", name=" + name + ", email=" + email + "]";
	}
	
}
