package cn.dxjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@RestController
public class LoginRestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getUserList")
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");

        return listUser;
    }


    @RequestMapping(value = "/getList/{id}",method= RequestMethod.GET)
    public Object getOrderByUserList(@PathVariable("id") long id) {

        return restTemplate.getForObject("http://service-mybaties/dept/get/" + id, Object.class);
    }

    @RequestMapping(value = "/getport",method= RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String liststring() {

        return restTemplate.getForObject("http://service-mybaties/dept/getport", String.class);
    }

}