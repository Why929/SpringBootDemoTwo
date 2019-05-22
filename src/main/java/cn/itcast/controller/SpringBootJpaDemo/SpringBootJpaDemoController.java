package cn.itcast.controller.SpringBootJpaDemo;



import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class SpringBootJpaDemoController {

//注入接口:UserDao层,直接注入
@Autowired
private UserDao userDao;

    @RequestMapping("/findById")
    public User findUser(Long id){//页面传值?id=1
//        1.第一步拿到的不是User
        Optional<User> byId = userDao.findById(id);
//        2.再次.get才能得到
        User user = byId.get();
        return user;
    }
}
