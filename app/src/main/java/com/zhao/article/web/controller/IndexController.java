package com.zhao.article.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @date 2018/7/25
 */
@RestController
@Slf4j
public class IndexController {
    @GetMapping("/")
    public String index() {
        log.info("controller say success");
        return "welcome to article!";
    }

}
