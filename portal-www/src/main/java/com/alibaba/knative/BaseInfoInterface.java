package com.alibaba.knative;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author caogu.wyp
 * @version $Id: caogu.wyp.java, v 0.1 2019年11月15日 上午2:32 Exp $
 */
@FeignClient("baseinfo")
public interface BaseInfoInterface {

    @RequestMapping(value = "/api/baseinfo")
    String baseinfo();
}