package com.spring.beans1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        Employee e = context.getBean("employeeBean", Employee.class);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.hashCode());
        Employee e1 = context.getBean("employeeBean", Employee.class);

        if (e == e1) {
            System.out.println("singleton");
        }
    }
}
