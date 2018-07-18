package com.jpa.demo.bean;

import com.jpa.demo.bean.common.BaseBean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName:com.jpa.demo.bean.UserBean
 * @Decription：用户类
 * @Author： huang_guoqiang
 * @Date 2018年06月29日 13:56
 */
@Entity
@Table(name = "sys_user")
public class UserBean extends BaseBean{

    /**
     * 无参构造
     */
    public UserBean() {
    }

    /**
     * 有参构造函数
     * @param name
     * @param password
     */
    public UserBean(String name, String password) {
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
        return "UserBean{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
