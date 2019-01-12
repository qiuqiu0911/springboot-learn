package cn.qiuqiuweb.learn.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ELMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
