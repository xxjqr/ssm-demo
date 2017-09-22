package com.xxjqr.ssm_demo_mx.service.impl;



import com.xxjqr.ssm_demo_mx.comm.po.Pager;
import com.xxjqr.ssm_demo_mx.comm.util.PagerUtil;
import com.xxjqr.ssm_demo_mx.pojo.ProductCond;
import org.springframework.stereotype.Service;
import com.xxjqr.ssm_demo_mx.mapper.ProductMapper;
import com.xxjqr.ssm_demo_mx.service.ProductService;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
	@Resource
	private ProductMapper productMapper;

	@Override
	public Pager listProducts(ProductCond productCond) {

		return PagerUtil.query(()->productMapper.selectByCond(productCond));
	}


}
