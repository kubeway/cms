package com.alibaba.knative;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author caogu.wyp
 * @version $Id: caogu.wyp.java, v 0.1 2019年11月15日 上午2:03 Exp $
 */
@Configuration
public class CfgBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}