package cn.dxjava.service;

import cn.dxjava.fallback.FallBackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "service-mybaties",fallback = FallBackImpl.class)
public interface FeignService {

    @RequestMapping("/dept/list")
    public Object getAll();

    @RequestMapping("/dept/getport")
    public String getString();
}
