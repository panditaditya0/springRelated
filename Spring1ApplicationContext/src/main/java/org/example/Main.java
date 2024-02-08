package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String path = "ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        Student std = (Student) context.getBean("student1");
        std.display();
    }
}