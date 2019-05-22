package cn.itcast.controller.SpringBootRedis;

import cn.itcast.dao.UserDao;
import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/redis")
public class SpringBootRedisDemo {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/findById")
    public User findById(Long id){

        User user = (User) redisTemplate.opsForValue().get("user" + id);

        if (user == null){
            Optional<User> byId = userDao.findById(id);
            user = byId.get();
//            放到redis中一个
            redisTemplate.opsForValue().set("user" + id,user);
        }
        return user;
    }

}
