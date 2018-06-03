package com.cfang.entity;

import java.util.Date;

public class TblViewInfo extends BaseEntity{

	private String viewId;
	private String viewName;
	private Date viewTime;
	private String viewPhoto;
	private String submitUser;
	private String desc;
	private String status;	//是否有效
	public String getViewId() {
		return viewId;
	}
	public void setViewId(String viewId) {
		this.viewId = viewId;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public Date getViewTime() {
		return viewTime;
	}
	public void setViewTime(Date viewTime) {
		this.viewTime = viewTime;
	}
	public String getViewPhoto() {
		return viewPhoto;
	}
	public void setViewPhoto(String viewPhoto) {
		this.viewPhoto = viewPhoto;
	}
	public String getSubmitUser() {
		return submitUser;
	}
	public void setSubmitUser(String submitUser) {
		this.submitUser = submitUser;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
