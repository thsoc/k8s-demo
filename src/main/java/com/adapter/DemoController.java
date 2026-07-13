package com.adapter;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
@Slf4j
public class DemoController {

    @GetMapping("/test/{msg}")
    public String test(@PathVariable String msg) {
        log.info("msg:{}", msg);
        System.out.println("msg:"+ msg);
        return "发送成功";
    }
}
