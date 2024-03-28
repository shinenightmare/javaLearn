package org.stream;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
@Setter
public class User {
    private String userId;
    private String name;
    private Integer age;
    private Date birth;
    private Department department;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", department=" + department +
                '}';
    }

    public User(String userId, String name, Integer age, Date birth, Department department) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.department = department;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
