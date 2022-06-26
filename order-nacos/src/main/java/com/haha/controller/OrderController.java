package com.haha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/5/10 15:57
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){

        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);
        return "hello,world"+msg;

    }

}
