package com.alibaba.knative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author caogu.wyp
 * @version $Id: caogu.wyp.java, v 0.1 2019年11月15日 上午2:00 Exp $
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerMain {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerMain.class);
    }
}