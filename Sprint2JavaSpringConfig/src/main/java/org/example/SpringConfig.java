package org.example;

import org.example.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig{

    @Bean
    public Student stdId(){
        Student std = new Student();
        std.setName("Aditya");
        std.setRollNo(2);
        std.setEmail("Aditya@.com");
        return std;
    }

    @Bean("studentBean")
    public Student anyMethodName(){
        Student std = new Student();
        std.setName("Pandit");
        std.setRollNo(3);
        std.setEmail("Pandit@.com");
        return std;
    }
}