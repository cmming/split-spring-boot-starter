/*
 * Copyright 2000-2030 YGSoft.Inc All Rights Reserved.
 */
package com.chmi.springboot.splitspringbootstarter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类注释 .
 *
 * @author ChenMing <br>
 * @version JDK 1.8
 * @since 2023/4/4 14:29 <br>
 */
@Component
@ConfigurationProperties(prefix = "split")
public class SplitConfig {

    @Value(value = "${split.separator:,}")
    private String separator;

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }
}
