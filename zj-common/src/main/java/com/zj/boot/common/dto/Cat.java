package com.zj.boot.common.dto;

import com.zj.boot.common.NameInterface;

/**
 * @author 郑军
 * @date 2021-11-15 22:28
 */
public class Cat implements NameInterface {

    @Override
    public String getName() {
        return "cat";
    }
}
