package cn.itcast.config;

import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class)
public class DefaultFeignConfiguration {
    @Bean
    public feign.Logger.Level logLevel() {
        return Logger.Level.BASIC;
    }
}
