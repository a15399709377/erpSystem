package com.lt.pojo;

public class tp {
	private int tid;
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "tp [tid=" + tid + ", tname=" + tname + "]";
	}
	public tp(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public tp() {
		super();
	}
	
}
