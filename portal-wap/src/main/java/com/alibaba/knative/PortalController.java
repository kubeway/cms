package com.alibaba.knative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author caogu.wyp
 * @version $Id: caogu.wyp.java, v 0.1 2019年11月15日 上午1:57 Exp $
 */
@RestController
public class PortalController {

    @Autowired
    private ProviderInterface providerInterface;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {

        return providerInterface.hello();
    }

    @RequestMapping(path = "/index/common", method = {RequestMethod.GET, RequestMethod.POST})
    public String indexCommon() {

        String url = "http://192.168.1.106:8081/hello";

        return restTemplate.getForObject(url, String.class);
    }

}