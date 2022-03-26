package com.telusko.AstraJavaDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    ConnectDatabase db = new ConnectDatabase();

    @RequestMapping("/{key}")
    @ResponseBody
    public String getValue(@PathVariable  String key){

        String value = db.getValue(key);

        return value;
    }

}
