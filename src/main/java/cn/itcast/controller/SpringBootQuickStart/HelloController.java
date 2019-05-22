package cn.itcast.controller.SpringBootQuickStart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1.正常写
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/hi")
    public String hello(){
        return "helloSpringboot";
//2.要想这个Controller项目运行,需要进行SpringBoot启动文件配置,位置没有特别的要求,
//        只是内容固定
    }
}
