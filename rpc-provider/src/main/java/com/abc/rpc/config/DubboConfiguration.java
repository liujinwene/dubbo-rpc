package com.abc.rpc.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liujinwen on 2018-08-06
 */
@Configuration
@DubboComponentScan(basePackages = "com.abc.rpc.service")
public class DubboConfiguration {
}
