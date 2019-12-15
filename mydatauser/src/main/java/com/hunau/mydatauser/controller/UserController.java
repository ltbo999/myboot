package com.hunau.mydatauser.controller;

import com.hunau.mydatauser.Dao.UserDao;
import com.hunau.mydatauser.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Systemname:湖南灾害应急管理系统
 * @Author:czc
 * @Description:
 * @Date:Created in $[TIME] $[DATE]
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:czc
 */
import com.hunau.mydatauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
    // @Resource
    // private UserDao userDao;
    @Autowired
    UserService userService;

    @RequestMapping("/index")//映射到网页
    public  String Index(Model model){
        return "index";
    }

    @RequestMapping("/query")
    public String Query(Model model){

        model.addAttribute("users", userService.findBy("唐耿涛"));//从数据库查询用户的信息
        return "query";
    }

    @RequestMapping("showUser/{id}")
    public String showUser(@PathVariable int id,Model model){
        model.addAttribute("name",userService.selectUser(id).toString());
        return "showuser";
    }
}