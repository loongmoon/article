package com.zhao.article.web.controller;

import com.zhao.article.api.StoryApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author catface
 * @date 2018/7/25
 */
@RestController
@Slf4j
public class StoryController implements StoryApi {
    @Override
    @GetMapping("/story/list")
    public String list() {
        log.info("list");
        return "list";
    }

}
