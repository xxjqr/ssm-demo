package com.xxjqr.ssm_demo_mx.pojo;

import lombok.Data;

@Data
public class ProductCond {
    private String keyword;
    public ProductCond(){};
    public ProductCond(String keyword){
        this.keyword = keyword;
    }
}
