package com.hjp.boot_web_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getuser(){
        return "Get--User";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String postUser(){
        return "POST--User";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE--User";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT--User";
    }
}
