package com.springmvc.controller;

import com.springmvc.pojo.Admin;
import com.springmvc.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class Main {

    @Resource
    private AdminService adminService;

    @RequestMapping("/")
    @ResponseBody
    public String init(){
        return "Hello world!";
    }

    @RequestMapping(value = "/admin",method = RequestMethod.POST)
    @ResponseBody
    public int insertUser(Admin admin){
        return adminService.insertAdmin(admin);

    }
    @RequestMapping(value = "/admin/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Admin getUser(@PathVariable Integer id){
        return adminService.getAdmin(id);

    }

    @RequestMapping(value = "/testLink")
    @ResponseBody
    public String testLink(){
        return "welcome my ssm!";
    }
}
