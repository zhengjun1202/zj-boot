package com.zj.boot.test;

import com.zj.boot.common.NameInterface;
import com.zj.boot.common.util.ClassUtil;
import org.reflections.ReflectionUtils;
import org.reflections.scanners.Scanners;

import java.util.List;
import java.util.Set;

/**
 * @author 郑军
 * @date 2021-11-15 22:55
 */
public class Test1 {

    public static void main(String[] args) {
        Set<Class<? extends NameInterface>> classSet = ClassUtil.getSubClass(NameInterface.class, "com.zj.boot");

        for (Class<?> aClass : classSet) {
            System.out.println(aClass);
        }

        ReflectionUtils.getSuperTypes(NameInterface.class);

    }
}
