package cn.itcast.controller.SpringBootMybatisDemo;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//localhost:9998/mybatis/findAll
@Controller
@RequestMapping("/mybatis")
public class SpringBootMybatisController {

    @Autowired
    private UserMapper userMapper;//报红不影响

    @RequestMapping("/findAll")
    public String mybaits(Model model){
        List<User> list = userMapper.findAll();
        model.addAttribute("list",list);
        return "freemakerFtlName";
    }

}
