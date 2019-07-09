package com.ldy.bean;

public class Movie {
	private Integer mid;
	private String mname;
	private String mdy;
	private Integer price;
	private String mtime;
	private Integer msc;
	private Integer myear;
	private String mqy;
	private Integer mtype;
	private Integer tid;
	
	private String tname;
	private String tyname;
	
	
	
	public String getTyname() {
		return tyname;
	}
	public void setTyname(String tyname) {
		this.tyname = tyname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMdy() {
		return mdy;
	}
	public void setMdy(String mdy) {
		this.mdy = mdy;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getMtime() {
		return mtime;
	}
	public void setMtime(String mtime) {
		this.mtime = mtime;
	}
	public Integer getMsc() {
		return msc;
	}
	public void setMsc(Integer msc) {
		this.msc = msc;
	}
	public Integer getMyear() {
		return myear;
	}
	public void setMyear(Integer myear) {
		this.myear = myear;
	}
	public String getMqy() {
		return mqy;
	}
	public void setMqy(String mqy) {
		this.mqy = mqy;
	}
	public Integer getMtype() {
		return mtype;
	}
	public void setMtype(Integer mtype) {
		this.mtype = mtype;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mdy=" + mdy
				+ ", price=" + price + ", mtime=" + mtime + ", msc=" + msc
				+ ", myear=" + myear + ", mqy=" + mqy + ", mtype=" + mtype
				+ ", tid=" + tid + "]";
	}
	public Movie(Integer mid, String mname, String mdy, Integer price,
			String mtime, Integer msc, Integer myear, String mqy,
			Integer mtype, Integer tid) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mdy = mdy;
		this.price = price;
		this.mtime = mtime;
		this.msc = msc;
		this.myear = myear;
		this.mqy = mqy;
		this.mtype = mtype;
		this.tid = tid;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
