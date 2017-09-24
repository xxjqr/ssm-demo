package com.xxjqr.ssm_demo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductCond implements Serializable{
    private static final long serialVersionUID = -9482812347739141L;
    private String keyword;
    public ProductCond(){};
    public ProductCond(String keyword){
        this.keyword = keyword;
    }
}
