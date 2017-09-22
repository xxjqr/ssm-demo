package com.xxjqr.ssm_demo_mx.controller;


import com.xxjqr.ssm_demo_mx.comm.po.Pager;
import com.xxjqr.ssm_demo_mx.pojo.ProductCond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxjqr.ssm_demo_mx.service.ProductService;

@Controller
@RequestMapping("rest")
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	@ResponseBody
	public Pager listProducts(ProductCond productCond){
		return productService.listProducts(productCond);
	}
}
