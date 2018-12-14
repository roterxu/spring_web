package com.xj.expend.service;

import com.xj.expend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {
    void add(User user);

    void edit(User user);

    void delete(int id);

    User findById(int id);

    User findByName(String name);

    List<User> findAll();
}
