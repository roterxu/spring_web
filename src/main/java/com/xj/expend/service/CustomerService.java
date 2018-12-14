package com.xj.expend.service;

import com.github.pagehelper.PageInfo;
import com.xj.expend.entity.Customer;
import com.xj.expend.utils.MvcDataDto;

import java.util.List;

public interface CustomerService {

    //新增
    void add(Customer customer);

    //编辑
    void edit(Customer customer);

    //删除
    void delete(int id);

    //获取单个
    Customer getById(int id);
    //获取所有
    List<Customer> listByAll();

    //翻页
    PageInfo<Customer> listPages(MvcDataDto param);
}
