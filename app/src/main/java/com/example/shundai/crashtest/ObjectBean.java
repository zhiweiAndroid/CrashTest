package com.example.shundai.crashtest;

import static com.example.shundai.crashtest.MainActivity.param;

/**
 * Created by win7 on 2017/9/27.
 */

public class ObjectBean {
    private String name;
    private int age;

    public ObjectBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
