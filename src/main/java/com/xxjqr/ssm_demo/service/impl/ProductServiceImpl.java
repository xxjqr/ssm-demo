package com.xxjqr.ssm_demo.service.impl;



import com.xxjqr.ssm_demo.comm.po.Pager;
import com.xxjqr.ssm_demo.comm.util.PagerUtil;
import com.xxjqr.ssm_demo.pojo.ProductCond;
import org.springframework.stereotype.Service;
import com.xxjqr.ssm_demo.mapper.ProductMapper;
import com.xxjqr.ssm_demo.service.ProductService;

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
