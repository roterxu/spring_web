package com.xj.expend.dao;

import com.xj.expend.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer customer);

    int insertSelective(Customer customer);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer customer);

    int updateByPrimaryKey(Customer customer);


    List<Customer> findByAll();

    List<Customer> listPages();
}