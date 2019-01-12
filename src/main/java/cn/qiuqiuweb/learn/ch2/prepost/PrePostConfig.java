package cn.qiuqiuweb.learn.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qiuqiu
 */
@Configuration
@ComponentScan("cn.qiuqiuweb.learn.ch2.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }


    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
