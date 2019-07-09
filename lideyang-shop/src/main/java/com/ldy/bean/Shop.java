package com.ldy.bean;

public class Shop {
	private Integer sid;
	private String sname;
	private String sdate;
	
	private String gid;
	private String gname;
	private String gnames;
	
	
	public String getGnames() {
		return gnames;
	}
	public void setGnames(String gnames) {
		this.gnames = gnames;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", sdate=" + sdate
				+ "]";
	}
	public Shop(Integer sid, String sname, String sdate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdate = sdate;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
