package cn.itcast.dao;

import cn.itcast.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

//dao层是接口,继承 JpaRepository<User,Integer>
public interface UserDao extends JpaRepository<User,Long> {
}
