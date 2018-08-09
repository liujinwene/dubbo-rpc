package com.abc.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liujinwen on 2018-08-06
 */
@SpringBootApplication
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ConsumerApp.class);
        app.run();
    }
}
