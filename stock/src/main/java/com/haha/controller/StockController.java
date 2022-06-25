package com.haha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/5/10 16:00
 */
@RequestMapping("/stock")
@RestController
public class StockController {

    @RequestMapping("/reduct")
    public String reduct(){

        System.out.println("扣减库存");
        return "扣减库存";
    }

}
