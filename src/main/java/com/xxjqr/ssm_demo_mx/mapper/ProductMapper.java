package com.xxjqr.ssm_demo_mx.mapper;

import java.util.List;

import com.xxjqr.ssm_demo_mx.pojo.Product;
import com.xxjqr.ssm_demo_mx.pojo.ProductCond;

public interface ProductMapper {

    List<Product> selectByCond(ProductCond prodCond);
}
