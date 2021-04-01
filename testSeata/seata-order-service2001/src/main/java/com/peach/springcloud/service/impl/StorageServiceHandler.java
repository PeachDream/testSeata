package com.peach.springcloud.service.impl;

import com.peach.springcloud.entity.CommonResult;
import com.peach.springcloud.service.StorageService;
import org.springframework.stereotype.Component;

@Component
public class StorageServiceHandler implements StorageService {

    @Override
    public CommonResult update(Long id, Integer number) {
        return new CommonResult(444,"出现异常了，这里是StorageServiceHandler");
    }
}
