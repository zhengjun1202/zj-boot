package com.zj.boot.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 郑军
 * @date 2021-11-20 08:34
 */
@Data
@ConfigurationProperties(prefix = "config")
public class PropertiesConfig {

    private String string;

    private Integer integer;

    private Date date;

    private String[] strings;

    private List<String> list;

    private Map<String, String> map;

    private List<Map<String, String>> mapList;

    private Map<String, List<String>> listMap;


}
