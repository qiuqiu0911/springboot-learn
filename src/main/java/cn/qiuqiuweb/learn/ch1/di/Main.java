package cn.qiuqiuweb.learn.ch1.di;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qiuqiu
 * 为了演示依赖注入 DI
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("spring boot"));
        context.close();
    }
}
