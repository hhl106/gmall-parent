package com.atguigu.gmall.product.controller;


import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.model.product.BaseCategory3;
import com.atguigu.gmall.product.service.BaseManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/product")
public class BaseManageController {

    @Autowired
    private BaseManageService baseManageService;


    /**
     * /admin/product/getCategory3/{category2Id}
     * 根据二级分类id获取三级分类数据
     */
    @GetMapping("/getCategory3/{category2Id}")
    public Result getCategory3(@PathVariable Long category2Id){
        List<BaseCategory3> baseCategory3List = baseManageService.getCategory3(category2Id);
        return Result.ok(baseCategory3List);
    }



    /**
     * 获取一级分类数据
     */
    @GetMapping("getCategory1")
    public Result getCategory1(){
        List<BaseCategory1> baseCategory1List = baseManageService.getCategory1();
        return Result.ok(baseCategory1List);
    }

    /**
     * 根据一级id获取二级分类数据
     * /admin/product/getCategory2/{category1Id}
     */
    @GetMapping("getCategory2/{category1Id}")
    public Result getCategory2(@PathVariable long category1Id){
        List<BaseCategory2> baseCategory2 = baseManageService.getCategory2(category1Id);
        return Result.ok(baseCategory2);
    }

}
