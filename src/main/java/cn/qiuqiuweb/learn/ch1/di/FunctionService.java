package cn.qiuqiuweb.learn.ch1.di;

import org.springframework.stereotype.Service;

/**
 * @author qiuqiu
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word;
    }
}