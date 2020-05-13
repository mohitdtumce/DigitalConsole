package com.flipkart.digitalconsole30.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@ComponentScan
public class IndexController {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
}
