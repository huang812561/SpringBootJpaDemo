package com.jpa.demo.respository;

import com.jpa.demo.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName:com.jpa.demo.respository.UserRespository
 * @Decription：用户
 * @Author： huang_guoqiang
 * @Date 2018年06月29日 14:01
 */
public interface UserRespository extends JpaRepository<UserBean,Long>{

    List<UserBean> findByName(String name);
}
