package com.zxjz.info.controller;

import com.zxjz.info.common.Result;
import com.zxjz.info.mapper.InfoMapper;
import com.zxjz.info.polo.InfoCategoryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yangbin
 */ //资讯详情页面
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/info")
public class InfoController {
   @Autowired
    InfoMapper infoMapper;
    //获取资讯分类
    @GetMapping("/category")
    public Result getInfoCategory() {
        List<InfoCategoryData> list =  infoMapper.getInfoCategoryList();
        if (list.isEmpty()){
            return Result.fail("111");

        }else {
            return Result.success(list,"请求成功");
        }

    }
}
