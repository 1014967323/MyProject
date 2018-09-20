package cn.dxjava.fallback;

import cn.dxjava.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FallBackImpl implements FeignService {

    // 服务的降级处理
    @Override
    public String getAll() {

        return "服务发生异常......";
    }

    @Override
    public String getString() {

        return "字符串获取异常......";
    }
}
