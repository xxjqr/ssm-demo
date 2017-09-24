package com.xxjqr.ssm_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxjqr.ssm_demo.pojo.Brand;
import com.xxjqr.ssm_demo.service.BrandService;

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
