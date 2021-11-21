package com.zj.boot.web.Index;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 郑军
 * @date 2021-10-31 18:22
 */
@RequestMapping("/index")
@Controller
public class HomeIndex {

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "index";
    }

}
