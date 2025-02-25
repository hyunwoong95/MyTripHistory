package com.mth.MyTripHistory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {

    @RequestMapping(value="/index")
    public String getIndexPage(){
        return "index";
    }

}
