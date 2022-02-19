package com.zj.boot.web.test;

import com.zj.boot.common.listener.ApplicationContextStartedListener;
import org.springframework.boot.ApplicationArguments;

/**
 * @author 郑军
 * @date 2021-11-27 11:02
 */
public class SoutName implements ApplicationContextStartedListener {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("---------------------name--------------------");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
