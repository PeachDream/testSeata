package com.peach.springcloud.service.impl;

import com.peach.springcloud.entity.CommonResult;
import com.peach.springcloud.service.AccountService;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceHandler implements AccountService {
    @Override
    public CommonResult update(Long id, Long number) {
        return new CommonResult(444,"出错了，这是兜底的方法AccountServiceHandler");
    }
}
