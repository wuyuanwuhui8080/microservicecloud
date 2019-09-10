package com.nzh.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 牛自豪
 * @className ConfigBean
 * @description 这个类的作用
 * @date 2019/9/10 14:58
 */
@Configuration
public class ConfigBean {//boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
