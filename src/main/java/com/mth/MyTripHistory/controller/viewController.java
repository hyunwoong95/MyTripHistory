package com.mth.MyTripHistory.controller;

import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {

    public final static String PC_VIEW = null;
    public final static String MOBILE_VIEW = null;

    @GetMapping("/")
    public String home(Request request){
        return "home";
    }

    @GetMapping("/index")
    public String getIndexPage(Request request){
        return "index";
    }

}
