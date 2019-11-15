package com.alibaba.knative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author caogu.wyp
 * @version $Id: caogu.wyp.java, v 0.1 2019年11月15日 上午2:00 Exp $
 */

@SpringBootApplication
@EnableEurekaClient
public class ProviderMain {

    public static void main(String[] args) {

        SpringApplication.run(ProviderMain.class);
    }
}