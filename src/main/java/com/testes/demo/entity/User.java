package com.testes.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Description:
 * @Author:cdd
 * @CreateDate:
 * @UpdateDate:
 */
//文档注解
@Document(indexName = "baizhi",type = "user")
public class User {
    //主键
    @Id
    private String id;
    private String realName;
    private Integer age;

    public User() {
    }

    //从es中恢复数据时使用的构造方法
    @PersistenceConstructor
    public User(String id, String realName, Integer age) {
        this.id = id;
        this.realName = realName;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", realName='" + realName + '\'' +
                ", age=" + age +
                '}';
    }
}
