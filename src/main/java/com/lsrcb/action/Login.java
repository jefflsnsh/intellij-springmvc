package com.lsrcb.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jeff on 2016-10-18.
 */
@Controller
public class Login {
    @RequestMapping("/hello.do")
    public String doHello()
    {
        return "index";
    }
}
