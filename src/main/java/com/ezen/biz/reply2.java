package com.ezen.biz;

public class reply2 {

	private Long seq;
	private String subject;
	private String content;
	private long bno;
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getBno() {
		return bno;
	}
	public void setBno(long bno) {
		this.bno = bno;
	}
	@Override
	public String toString() {
		return "reply2 [seq=" + seq + ", subject=" + subject + ", content=" + content + ", bno=" + bno + "]";
	}
	
}
