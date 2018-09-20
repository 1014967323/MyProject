package cn.dxjava.controller;

import cn.dxjava.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginFeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/getAll")
    public Object getAll(){

        return feignService.getAll();
    }

    @RequestMapping("/getString")
    public String getString(){

        return feignService.getString();
    }
}
