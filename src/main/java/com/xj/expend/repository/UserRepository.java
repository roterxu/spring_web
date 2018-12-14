package com.xj.expend.repository;

import com.xj.expend.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer>{

    /**
     * jpa自动根据方法查询sql
     */
    User findById(int id);

    User findByName(String name);

    void deleteById(int id);


    //自定义sql
    @Modifying
    @Query(value = "select * from user" ,nativeQuery = true)
    List<User> findAll();
}
