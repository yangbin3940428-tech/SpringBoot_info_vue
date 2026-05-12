package com.zxjz.info.controller;

import com.zxjz.info.common.Result;
import org.springframework.web.bind.annotation.*;

//资讯详情页面
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/info")
public class InfoController {







    //获取资讯分类
    @GetMapping("/category")
    public Result getInfoCategory() {
        return Result.fail("11111");
    }
}
