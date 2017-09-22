package com.xxjqr.ssm_demo_mx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxjqr.ssm_demo_mx.mapper.BrandMapper;
import com.xxjqr.ssm_demo_mx.pojo.Brand;
import com.xxjqr.ssm_demo_mx.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandMapper brandMapper;
	
	@Override
	public List<Brand> getBrands() {
		return brandMapper.getBrands();
	}

}
