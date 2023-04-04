/*
 * Copyright 2000-2030 YGSoft.Inc All Rights Reserved.
 */
package com.chmi.springboot.splitspringbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 类注释 .
 *
 * @author ChenMing <br>
 * @version JDK 1.8
 * @since 2023/4/4 13:44 <br>
 */
@Configuration
@ConditionalOnClass(value = {ISplitService.class, ISplitServiceImpl.class})
public class SplitAutoConfigure {

    @Resource
    private SplitConfig splitConfig;

    @Bean
    @ConditionalOnMissingBean
    ISplitService startService(){
        return new ISplitServiceImpl(splitConfig.getSeparator());
    }
}
