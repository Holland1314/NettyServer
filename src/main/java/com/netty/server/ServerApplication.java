package com.netty.server;

import com.netty.server.config.NettyServerListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServerApplication.class);
    static ApplicationContext ctx;
     NettyServerListener nettyServerListener;

    public static void main(String[] args) {

        ctx = SpringApplication.run(ServerApplication.class, args);
        //ShowBeans();
        //nettyServerListener = (NettyServerListener) ctx.getBean("nettyServerListener");
    }

    @Override
    public void run(String... strings) throws Exception {
        //nettyServerListener = (NettyServerListener) ctx.getBean("nettyServerListener");
        //nettyServerListener.start();
    }

    public static void ShowBeans() {
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            LOGGER.info(beanName + "," + ctx.getBean(beanName).getClass());
        }
    }
}
