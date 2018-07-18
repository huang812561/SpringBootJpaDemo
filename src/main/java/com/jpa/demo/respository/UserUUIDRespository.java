package com.jpa.demo.respository;

import com.jpa.demo.bean.UserUUID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName:com.jpa.demo.respository.EmployeeRespository
 * @Decription：
 * @Author： huang_guoqiang
 * @Date 2018年07月02日 14:02
 */
public interface UserUUIDRespository extends JpaRepository<UserUUID,String> {
        List<UserUUID> findByName(String name);
}
