package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/5/10 16:04
 */
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrderApplication.class,args);

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){

        RestTemplate restTemplate = builder.build();

        return restTemplate;

    }

}
