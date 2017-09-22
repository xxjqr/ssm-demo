package com.xxjqr.ssm_demo_mx.pojo;

import lombok.Data;

@Data
public class ProductQuery extends Page{

	private String brand;
	private String productName;
	
	public ProductQuery(String productName,String brand) {
		this.brand = brand;
		this.productName = productName;
	}
}
