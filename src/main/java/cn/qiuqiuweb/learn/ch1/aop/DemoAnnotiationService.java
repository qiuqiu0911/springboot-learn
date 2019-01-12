package cn.qiuqiuweb.learn.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @author qiuqiu
 * 使用注解的被拦截类
 */
@Service
public class DemoAnnotiationService {

    @Action(name = "注解式拦截add操作" )
    public void add(){

    }
}
