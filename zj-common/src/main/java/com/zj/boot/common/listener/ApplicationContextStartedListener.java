package com.zj.boot.common.listener;

import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;

/**
 * 应用上下文启动完成之后执行的事件
 *
 * @author 郑军
 * @date 2021-11-27 10:48
 */
public interface ApplicationContextStartedListener extends ApplicationRunner, Ordered {

}
