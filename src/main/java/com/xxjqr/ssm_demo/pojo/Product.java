package com.xxjqr.ssm_demo.pojo;

import lombok.Data;

import java.io.Serializable;

//@Data
public class Product implements Serializable{

	private static final long serialVersionUID = 7882979368647525931L;

	private Integer id;
	private String number;
	private String name;
	private String desc;
	private Integer brandId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
}
