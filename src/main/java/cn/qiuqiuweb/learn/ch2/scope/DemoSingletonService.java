package cn.qiuqiuweb.learn.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author qiuqiu
 * 一个spring容器中只有一个bean的实例 此为Spring的默认实例
 */
@Service
//@Scope("singleton")
public class DemoSingletonService {
}
