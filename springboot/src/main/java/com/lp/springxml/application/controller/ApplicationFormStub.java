package com.lp.springxml.application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: liangpeng
 * @Date: 2022/5/8 19:49
 */
public interface ApplicationFormStub {

    String BASE_URI = "applicationFormRpc";

    @PostMapping(value = BASE_URI + "/findByFormCode")
    Object findByFormCode(@RequestParam("formCode") String formCode);

    @PostMapping(value = BASE_URI + "/update")
        // todo 跨服务写 工作流事件监听，对于零件号的监听应放在主数据模块
    Object update();
}
