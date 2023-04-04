/*
 * Copyright 2000-2030 YGSoft.Inc All Rights Reserved.
 */
package com.chmi.springboot.splitspringbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 类注释 .
 *
 * @author ChenMing <br>
 * @version JDK 1.8
 * @since 2023/4/4 13:43 <br>
 */
public class ISplitServiceImpl implements ISplitService{
    private String separator;

    public ISplitServiceImpl(String separator) {
        this.separator = separator;
    }

    @Override
    public List<String> split(String value) {
        return Stream.of(StringUtils.split(value, separator)).collect(Collectors.toList());
    }
}
