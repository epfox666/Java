package com.tarena.entity;

import java.sql.Date;

public class Cost {
	private int id   ;
	private  String name  ;                   
	private  int baseDuration ;                   
	private double baseCost ;                         
	private double unitCost;                           
	private String descr;                              
	private Date createTime;
	public Cost() {
		super();
	}
	public Cost(int id, String name, int baseDuration, double baseCost, double unitCost, String descr,
			Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.baseDuration = baseDuration;
		this.baseCost = baseCost;
		this.unitCost = unitCost;
		this.descr = descr;
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseDuration() {
		return baseDuration;
	}
	public void setBaseDuration(int baseDuration) {
		this.baseDuration = baseDuration;
	}
	public double getBaseCost() {
		return baseCost;
	}
	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Cost [id=" + id + ", name=" + name + ", baseDuration=" + baseDuration + ", baseCost=" + baseCost
				+ ", unitCost=" + unitCost + ", descr=" + descr + ", createTime=" + createTime + "]";
	}
	
}
