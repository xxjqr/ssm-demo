package com.xxjqr.ssm_demo.mapper;

import java.util.List;

import com.xxjqr.ssm_demo.pojo.Product;
import com.xxjqr.ssm_demo.pojo.ProductCond;

public interface ProductMapper {

    List<Product> selectByCond(ProductCond prodCond);
}
