package cn.itcast.controller.YmlController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//localhost:9527/yml/abc
@RestController
@RequestMapping("/yml")
//-------------------------------------------------
//    2.读取.yml配置文件信息方式二:使用注解
@ConfigurationProperties(
        prefix = "user2"
//        ignoreUnknownFields = true //暂时不知道是干什么的
)
//-------------------------------------------------
public class YmlController {
//*************************************************
//    1.读取.yml配置文件信息方式一:@Value("${user.name}")
    @Value("${user2.name}")
    private String name;
//*************************************************

//    2.2:使用注解读取.yml后,需要在类中 给 被赋值变量进行 get/set方法补全,然后会自动进行赋值
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @RequestMapping("/abc")
    public String hello(){
        return name+"*********"+age;
    }

}
