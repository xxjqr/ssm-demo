package com.xxjqr.ssm_demo_mx.pojo;

import lombok.Data;

@Data
public class Product {
	private Integer id;
	private String number;
	private String name;
	private String desc;
	private Integer brandId;
}
