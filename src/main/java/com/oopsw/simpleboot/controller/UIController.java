package com.oopsw.simpleboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UIController {

    @GetMapping("/main")
    @ResponseBody
    public String main() {
        return "Main Page";
    }
}
