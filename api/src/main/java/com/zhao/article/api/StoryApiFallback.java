package com.zhao.article.api;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StoryApiFallback implements FallbackFactory<StoryApi> {
    @Override
    public StoryApi create(Throwable cause) {
        return new StoryApi() {
            @Override
            public String list() {
                log.error("调用同步案件接口异常!", cause);
                return "error";
            }
        };
    }
}
