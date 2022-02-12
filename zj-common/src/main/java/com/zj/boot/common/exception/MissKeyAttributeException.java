package com.zj.boot.common.exception;

/**
 * @author 郑军
 * @date 2022-01-12 22:25
 */
public class MissKeyAttributeException extends RuntimeException {

    private String keyAttribute;

    private Object properties;

    public MissKeyAttributeException(String message,  String keyAttribute, Object properties) {
        super(message);
        this.keyAttribute = keyAttribute;
        this.properties = properties;
    }

    public String getKeyAttribute() {
        return keyAttribute;
    }

    public void setKeyAttribute(String keyAttribute) {
        this.keyAttribute = keyAttribute;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }
}
