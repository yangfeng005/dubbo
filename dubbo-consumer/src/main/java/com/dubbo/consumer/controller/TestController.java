package com.dubbo.consumer.controller;

import com.dubbo.provider.api.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by yangfeng on 2017/7/13.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private static Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Resource
    private ITestService testService;

    @RequestMapping("/index")
    @ResponseBody
    public Object index() {
        return testService.getName();
    }
}
