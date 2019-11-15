package com.alibaba.knative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    private BaseInfoInterface baseInfoInterface;

    @Autowired
    private ContactInfoInterface contactInfoInterface;

    @RequestMapping(value = "/api/company/{companycode}", method = {RequestMethod.GET})

    public String company(@PathVariable String companycode) {
        System.out.println(companycode);

        String s = "{\n"
                + "    \"status\": \"success\",//success, fail\n"
                + "    \"errmsg\": \"\",// 错误信息\n"
                + "    \"data\": {\n"
                + "        \"name\": \"杭州科技\",\n"
                + "        \"address\": \"西湖区xx\",\n"
                + "        \"profile\": \"公司简介\",\n"
                + "        \"site\": \"http://xxx\",\n"
                + "        \"contact\":\"张三\",\n"
                + "        \"phone\":\"0000-111111\",\n"
                + "        \"email\":\"xxxx@t.com\"\n"
                + "      }\n"
                + "}";
        System.out.println(baseInfoInterface.hello() + "===" + contactInfoInterface.hello());
        return s;
    }

}