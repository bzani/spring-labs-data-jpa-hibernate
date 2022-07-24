package com.bdpz.labs.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) {
        ApplicationContextUtil.applicationContext = context;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
	
}
