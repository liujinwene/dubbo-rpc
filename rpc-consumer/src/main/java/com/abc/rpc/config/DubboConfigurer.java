package com.abc.rpc.config;

import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liujinwen on 2018-08-06
 */
@Configuration
@DubboComponentScan(basePackages = "com.abc.rpc.service")
public class DubboConfigurer {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-consumer");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://172.17.171.24:2181");
        registryConfig.setClient("curator");
        return registryConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setValidation("true");
        consumerConfig.setCheck(false);
        return consumerConfig;
    }
}
