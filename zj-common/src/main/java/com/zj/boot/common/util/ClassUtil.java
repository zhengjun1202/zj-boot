package com.zj.boot.common.util;

import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;

import java.util.Set;

/**
 * @author 郑军
 * @date 2021-11-15 22:32
 */
@Slf4j
public class ClassUtil {

    /**
     * 获取 指定类的所有子类
     *
     * @param clazz 接口 或者 类
     * @param packageName 扫描的包名，不能为空
     * @return List<Class> 接口或者类的所有子类
     */
    public static <T> Set<Class<? extends T>> getSubClass(Class<T> clazz, String packageName) {

        Reflections reflections = new Reflections(packageName);
        return reflections.getSubTypesOf(clazz);
    }

}
