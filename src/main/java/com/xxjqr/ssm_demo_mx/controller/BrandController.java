package com.xxjqr.ssm_demo_mx.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxjqr.ssm_demo_mx.pojo.Brand;
import com.xxjqr.ssm_demo_mx.service.BrandService;

@Controller
public class BrandController {
	@Autowired
	private BrandService brandService;
	
	@ResponseBody
	@RequestMapping("/brands")
	public List<Brand> getBrands(){
		List<Brand> brands= brandService.getBrands();
		return brands;
	}
}
