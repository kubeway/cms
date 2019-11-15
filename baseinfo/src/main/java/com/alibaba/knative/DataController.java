package com.alibaba.knative;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

/**
 * @author caogu.wyp
 * @version $Id: caogu.wyp.java, v 0.1 2019年11月15日 上午2:45 Exp $
 */
@RestController
public class DataController {

    @RequestMapping(value = "/api/baseinfo")
    public String baseinfo() throws IOException {

        ClassPathResource resource = new ClassPathResource("baseinfo.json");
        File file = resource.getFile();
        String jsonString = FileUtils.readFileToString(file);

        return jsonString;
    }

    public static void main(String[] args) throws IOException {

        ClassPathResource resource = new ClassPathResource("baseinfo.json");
        File file = resource.getFile();
        String jsonString = FileUtils.readFileToString(file);

        System.out.println(jsonString);

    }
}