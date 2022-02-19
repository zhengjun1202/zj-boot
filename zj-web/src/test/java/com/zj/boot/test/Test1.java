package com.zj.boot.test;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

/**
 * @author 郑军
 * @date 2021-11-15 22:55
 */
public class Test1 {

    public static void main(String[] args) {

    }


    @Test
    public void testYaml() {

        Yaml yaml = new Yaml();
        Object load = yaml.load(ClassLoader.getSystemClassLoader().getResourceAsStream("application.yml"));

        JSON parse = JSONUtil.parse(load);
        System.out.println(parse.toJSONString(2));

    }
}
