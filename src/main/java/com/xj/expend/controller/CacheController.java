package com.xj.expend.controller;

import com.xj.expend.entity.Customer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @RequestMapping("/listcustomers")
    @Cacheable(value = "listCustomers",key = "#length" ,sync = true)
    public List<Customer> listCustomer(Long length){
        List<Customer> customers=new ArrayList<>();
        for (int i=0;i<length;i++){
            Customer customer=new Customer(i,"zhuyu"+i,20+i,false);
            customers.add(customer);
        }
        return customers;
    }


}
