package com.jpa.demo.bean.common;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName:com.jpa.demo.bean.common.BaseBean
 * @Decription：
 * @Author： huang_guoqiang
 * @Date 2018年06月29日 13:58
 */
@MappedSuperclass
public class BaseBean implements Serializable{

    /**
     * 主键唯一标识
     * 4中生成策略：
     *   1.GenerationType.AUTO:【默认生成策略】 把主键生成策略交给持久化引擎(persistence engine),持久化引擎会根据数据库在以上三种主键生成策略中选择其中一种。
     *                      例如：@GeneratedValue(strategy = GenerationType.AUTO)也可以直接@GeneratedValue
     *   2.GenerationType.SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列
     *   3.GenerationType.IDENTITY：主键由数据库自动生成（主要是自动增长型）
     *   4.GenerationType.TABLE：使用一个特定的数据库表格来保存主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
