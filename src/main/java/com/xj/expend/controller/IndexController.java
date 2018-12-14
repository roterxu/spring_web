package com.xj.expend.controller;

import com.xj.expend.entity.User;
import com.xj.expend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    IUserService userService;


    @RequestMapping("/test")
    public String testGlobalException(){
        String str=null;
        if (str.equals("123")){

        }
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("index1")
    public String index1(ModelMap model) {
        System.out.println("index1");
        List<User> list = new ArrayList<User>();
        for (int i = 1; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setAge(19 + i);
            user.setName("zy" + i);
            list.add(user);
        }
        //在方法中使用ModelMap，然后把值返回到html页面
        model.addAttribute("user", list.get(0));
        model.addAttribute("users", list);
        return "index";//返回 tempaltes 下的 index.html
    }

    @RequestMapping("/add")
    @ResponseBody
    public void add(){
        System.out.println("add()+++++");
        User user = new User();
        user.setName("zy");
        user.setAge(26);
        userService.add(user);
    }

    @RequestMapping("/edit")
    @ResponseBody
    public void edit(){
        User user=new User();
        user.setId(1);
        user.setName("xujie");
        user.setAge(23);
        userService.edit(user);
    }




}
