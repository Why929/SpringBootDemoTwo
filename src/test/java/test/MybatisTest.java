package test;
//1.导入依赖,有scope域

import cn.itcast.MySpringBootApplication;
import cn.itcast.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//封装了SpringJunit4Runer.class原来的
@SpringBootTest(classes = MySpringBootApplication.class)//加载启动类
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;//报错不影响

    @Test
    public void demo_b(){
        System.out.println("我在这里我在这里"+userMapper.findAll());
    }
}
