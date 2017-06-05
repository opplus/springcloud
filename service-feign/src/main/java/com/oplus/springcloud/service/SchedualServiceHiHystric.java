package com.oplus.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by oplus on 2017/5/29.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}