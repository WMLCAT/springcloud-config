package com.wujie.bean;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class Student {
    private  String name;
    private  Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        System.out.println("构造器方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁方法");
    }



    @PostConstruct
    public void init(){
        System.out.println("初始方法");
    }



}
