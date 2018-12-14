package com.xj.expend.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xj.expend.dao.CustomerMapper;
import com.xj.expend.entity.Customer;
import com.xj.expend.utils.MvcDataDto;
import com.xj.expend.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService {

    @Autowired

    private CustomerMapper customerMapper;
    @Override
    public void add(Customer customer) {

        customerMapper.insert(customer);
    }

    @Override
    public void edit(Customer customer) {
        customerMapper.updateByPrimaryKey(customer);
    }

    @Override
    public void delete(int id) {
        customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Customer getById(int id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Customer> listByAll() {
        System.out.println("ServiceImpl  listByAll()");
        return customerMapper.findByAll();
    }

    //分页
    @Override
    public PageInfo<Customer> listPages(MvcDataDto param) {
        PageInfo<Customer> customers=null;
        Page page=param.getPage();
        if (page!=null){
            //翻页关键。调用插件的翻页方法。吧前端的翻页数据传进插件
            PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
            List<Customer> list=customerMapper.listPages();
            customers=new PageInfo<>(list);
        }
        return customers;
    }
}
