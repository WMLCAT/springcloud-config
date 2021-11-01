package com.wujie;

import com.wujie.bean.Student;
import com.wujie.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("已创建容器，未获取容器对象");
        Student student = (Student) context.getBean("student");
        System.out.println("成功获取容器对象");
        context.close();
    }
}
