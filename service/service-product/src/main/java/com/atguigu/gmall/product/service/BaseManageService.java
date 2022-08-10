package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.model.product.BaseCategory3;

import java.util.List;

public interface BaseManageService {

    //获取一级分类数据
    List<BaseCategory1> getCategory1();

    //根据一级id获取二级分类数据
    List<BaseCategory2> getCategory2(long category1Id);


    //根据二级分类id获取三级分类数据
    List<BaseCategory3> getCategory3(Long category2Id);

}
