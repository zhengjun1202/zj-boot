package com.zj.boot.common.exception.anlyzer;

import com.zj.boot.common.exception.MissKeyAttributeException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author 郑军
 * @date 2022-01-12 22:28
 */
public class MissKeyAttributeExceptionAnalyzer extends AbstractFailureAnalyzer<MissKeyAttributeException> {

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, MissKeyAttributeException cause) {
        Object properties = cause.getProperties();
        String keyAttribute = cause.getKeyAttribute();

        String descBuilder = properties.getClass().getName() +
                "-缺少重要属性: " +
                keyAttribute;
        String actionBuilder = properties.getClass().getName() +
                "-应设置属性: " +
                keyAttribute;
        return new FailureAnalysis(descBuilder, actionBuilder, cause);
    }
}
