package cn.qiuqiuweb.learn.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author qiuqiu
 * Prototype 每次调用新建一个bean的实例
 */
@Service
@Scope(value = "prototype")
public class DemoPrototypeService {
}
