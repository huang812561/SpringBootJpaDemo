package com.jpa.demo.bean;

import javax.persistence.*;

/**
 * @ClassName:com.jpa.demo.bean.UserSequence
 * @Decription：
 * @Author： huang_guoqiang
 * @Date 2018年07月02日 14:47
 */
@Entity
@Table(name = "sys_user_seq")
public class UserSequence {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    @SequenceGenerator(name = "id_sequence", initialValue = 1, allocationSize = 1, sequenceName = "ID_SEQUENCE")
    private long id;

    @Column(name = "user_name")
    private String name;
    @Column(name = "password")
    private String password;

    public UserSequence() {
    }

    public UserSequence(String name, String password) {
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
