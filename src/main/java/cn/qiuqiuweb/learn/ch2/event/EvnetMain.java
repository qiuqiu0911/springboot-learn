package cn.qiuqiuweb.learn.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EvnetMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish(" hello application event");

        context.close();

    }
}
