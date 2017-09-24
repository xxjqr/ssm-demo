package com.xxjqr.ssm_demo.service;

import com.xxjqr.ssm_demo.comm.po.Pager;
import com.xxjqr.ssm_demo.pojo.ProductCond;

public interface ProductService {
	Pager listProducts(ProductCond productCond);

}
