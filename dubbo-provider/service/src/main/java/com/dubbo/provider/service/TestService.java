package com.dubbo.provider.service;

import com.dubbo.provider.api.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    public String getName() {
        return "yangfeng test";
    }
}
