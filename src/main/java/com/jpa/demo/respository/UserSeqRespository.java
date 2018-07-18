package com.jpa.demo.respository;

import com.jpa.demo.bean.UserSequence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName:com.jpa.demo.respository.UserSeqRespository
 * @Decription：用户
 * @Author： huang_guoqiang
 * @Date 2018年06月29日 14:01
 */
public interface UserSeqRespository extends JpaRepository<UserSequence,Long>{

    List<UserSequence> findByName(String name);
}
