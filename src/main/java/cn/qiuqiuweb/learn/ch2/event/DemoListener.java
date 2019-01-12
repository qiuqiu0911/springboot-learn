package cn.qiuqiuweb.learn.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
//实现接口，并指定监听事件的类型
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    //使用onApplicationEvent方法对消息进行接受处理
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我（bean-DemoListener）接收到了 bean-demoPublisher发布的消息" + msg);
    }
}