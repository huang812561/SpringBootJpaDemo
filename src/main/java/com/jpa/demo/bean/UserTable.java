package com.jpa.demo.bean;

import javax.persistence.*;

/**
 * @ClassName:com.jpa.demo.bean.UserTable
 * @Decription：
 * @Author： huang_guoqiang
 * @Date 2018年07月02日 14:47
 */
@Entity
@Table(name = "sys_user_table")
public class UserTable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "id_sequence")
    @TableGenerator(name = "id_sequence", allocationSize=1,table = "sequence_table",pkColumnName = "PK_NAME",valueColumnName = "PK_VALUE")
    private long id;

    @Column(name = "user_name")
    private String name;
    @Column(name = "password")
    private String password;

    public UserTable() {
    }

    public UserTable(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}
