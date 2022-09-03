package com.zj.boot.web.test.repository;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author 郑军
 * @date 2021-10-31 22:47
 */
@Data
@Service
public class User {

    private String name;

    private Cat cat;

    public User(Cat cat) {
        this.cat = cat;
    }


}
