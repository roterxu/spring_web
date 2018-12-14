package com.xj.expend.controller;

import com.alibaba.fastjson.JSON;
import com.xj.expend.entity.Customer;
import com.xj.expend.service.CustomerService;
import com.xj.expend.utils.MvcDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public String list(ModelMap map){
        map.addAttribute("customers",customerService.listByAll());
        return "customer/list";
    }


    @RequestMapping("edit")
    public String edid(ModelMap map, @RequestParam(defaultValue = "0")int id){
        if (id>0){
            map.addAttribute("isAdd",false);
            map.addAttribute("customer",customerService.getById(id));
        }else {
            map.addAttribute("isAdd",true);
            map.addAttribute("customer",new Customer());
        }
        return "customer/edit";
    }

    /**
     * 新增/编辑
     */

    @RequestMapping("save")
    @ResponseBody
    public String save(@ModelAttribute Customer customer){
        if (customer == null){
            return "fail";
        }
        if (customer.getId()!=null&&customer.getId()>0){
            customerService.edit(customer);
        }else {
            customerService.add(customer);
        }
        return "success";
    }

    @RequestMapping("/del/{id}")
    public String delete(@PathVariable("id") int id){
        customerService.delete(id);
        return "list";
    }

    //打开翻页页面
    @RequestMapping("pages")
    public String listPages(){
        return "customer/pages";
    }

    //返回翻页数据
    @ResponseBody
    @RequestMapping("getListPage")
    public Object getListPage(String param){
        MvcDataDto data= JSON.parseObject(param,MvcDataDto.class);
        return customerService.listPages(data);
    }

}
