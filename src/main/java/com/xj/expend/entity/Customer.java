package com.xj.expend.entity;

public class Customer {
    private Integer id;

    private String name;

    private Integer age;

    private Boolean isUse;

    public Customer() {
    }

    public Customer(Integer id, String name, Integer age, Boolean isUse) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isUse = isUse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIsUse() {
        return isUse;
    }

    public void setIsUse(Boolean isUse) {
        this.isUse = isUse;
    }
}