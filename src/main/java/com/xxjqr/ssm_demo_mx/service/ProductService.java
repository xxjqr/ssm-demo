package com.xxjqr.ssm_demo_mx.service;

import java.util.Map;

import com.xxjqr.ssm_demo_mx.comm.po.Pager;
import com.xxjqr.ssm_demo_mx.pojo.Product;
import com.xxjqr.ssm_demo_mx.pojo.ProductCond;

public interface ProductService {
	Pager listProducts(ProductCond productCond);

}
