package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        String path = "org/example/SpringConfig.java";
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //bean name as method name
        Student std = (Student) context.getBean("stdId");
        std.display();

        //bean name from bean tag
        Student std2 = (Student) context.getBean("studentBean");
        std2.display();

    }
}