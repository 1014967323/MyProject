package cn.dxjava.service.impl;

import cn.dxjava.MybatiesApp;
import cn.dxjava.service.IDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;


@SpringBootTest(classes = MybatiesApp.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DeptServiceImplTest {

    @Resource
    private IDeptService deptServiceImpl ;

    @Test
    public void get() {
        System.out.println("获得");

        //System.out.println(deptServiceImpl.get(1));
    }

    @Test
    public void add() {
    }

    @Test
    public void list() {

        System.out.println("sasdsad");

        System.out.println(deptServiceImpl.list());
    }
}