package com.alibaba.knative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author caogu.wyp
 * @version $Id: caogu.wyp.java, v 0.1 2019年11月15日 上午2:45 Exp $
 */
@RestController
public class DataController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello")
    public String hello() {
        List<String> services = discoveryClient.getServices();
        for (String s : services) {
            System.out.println(s);
        }
        return "hello spring cloud!";
    }
}