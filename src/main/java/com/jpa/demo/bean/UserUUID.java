package com.jpa.demo.bean;

import com.jpa.demo.bean.common.SuperBean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName:com.jpa.demo.bean.common.EmployeeBean
 * @Decription：
 * @Author： huang_guoqiang
 * @Date 2018年07月02日 13:59
 */
@Entity
@Table(name = "sys_employee")
public class UserUUID extends SuperBean {

    public UserUUID() {
    }

    public UserUUID(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
