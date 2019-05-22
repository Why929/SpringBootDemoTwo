package cn.itcast.controller.SpringBootFreeMakerDemo;

 //SpringBootFreeMakerDemoController
import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller//当走视图解析器的时候,需要使用@Controller
@RequestMapping("/userFM")
public class SpringBootFreeMakerDemoController {

    //注入接口:UserDao层,直接注入
    @Autowired
    private UserDao userDao;
//------------------------------------------------------
//    直接将User对象响应会 通过浏览器访问的对象
    @RequestMapping("/findById")
//    区别
    @ResponseBody//同使用@RestController区别,这里如果需要返回对象,需要使用@ResponseBody将User对象响应回去
    public User findUser(Long id){//页面传值?id=1
//        1.第一步拿到的不是User
        Optional<User> byId = userDao.findById(id);
//        2.再次.get才能得到
        User user = byId.get();
        return user;
    }
//----------------------Freemaker------------------------------------------
// 将List<User> 通过Model html 通过视图解析器 响应给访问对象
    @RequestMapping("findAll")
    public String findAll(Model model){//或者使用ModelAndView

//        1.执行查询
        List<User> list = userDao.findAll();
        model.addAttribute("list",list);//查询结果 键值对形式:对应html.ftl页面中 遍历取的名字key
        return "freemakerFtlName";//Freemaker 模板对象名称,且其位置固定:resources/tempplates下 要导入依赖
    }

}



