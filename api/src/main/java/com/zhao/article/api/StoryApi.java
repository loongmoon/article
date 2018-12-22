package com.zhao.article.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ARTICLE", fallback = StoryApiFallback.class)
public interface StoryApi {
    @GetMapping("/story/list")
    String list();
}
