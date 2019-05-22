package cn.itcast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//1.使用@SpringBootApplicaton注解
@SpringBootApplication
//6.配置mapper包一级的路径
@MapperScan("cn.itcast.mapper")
public class MySpringBootApplication {
//2.psvm
public static void main(String[] args) {
//    3.使用SpringApplication.run(这个主类.class)
    SpringApplication.run(MySpringBootApplication.class);
//    4.运行:方式一1.直接运行主方法
//    5.运行:方式二2.

}
}
