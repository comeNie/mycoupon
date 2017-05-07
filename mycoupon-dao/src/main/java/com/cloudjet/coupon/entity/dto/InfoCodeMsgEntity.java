package com.cloudjet.coupon.entity.dto;

import com.cloudjet.coupon.entity.BaseEntity;

public class InfoCodeMsgEntity extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String isMsg;
	private String userBagId;
	private String codePlanId;
	private String cpCode;
	private Integer status;
	
	public String getUserBagId() {
		return userBagId;
	}
	public void setUserBagId(String userBagId) {
		this.userBagId = userBagId;
	}
	public String getCodePlanId() {
		return codePlanId;
	}
	public void setCodePlanId(String codePlanId) {
		this.codePlanId = codePlanId;
	}
	public String getCpCode() {
		return cpCode;
	}
	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getIsMsg() {
		return isMsg;
	}
	public void setIsMsg(String isMsg) {
		this.isMsg = isMsg;
	}
	
	
	
}
