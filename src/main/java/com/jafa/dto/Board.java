package com.jafa.dto;

import java.time.LocalDateTime;


public class Board {
	private long bno; // 게시물 번호
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
	
	public long getBno() {
		return bno;
	}
	public void setBno(long bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String contents) {
		this.content = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalDateTime getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	public Board() {}
	
	public Board(long bno, String title, String contents, String writer, LocalDateTime regDate,
			LocalDateTime updateDate) {
		this.bno = bno;
		this.title = title;
		this.content = contents;
		this.writer = writer;
		this.regDate = regDate;
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDate="
				+ regDate + ", updateDate=" + updateDate + "]";
	}
}
