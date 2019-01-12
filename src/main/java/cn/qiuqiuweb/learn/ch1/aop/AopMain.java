package cn.qiuqiuweb.learn.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotiationService demoAnnotiationService = context.getBean(DemoAnnotiationService.class);
        demoAnnotiationService.add();
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoMethodService.add();
        context.close();
    }
}
