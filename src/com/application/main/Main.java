package com.application.main;

import com.application.model.Course;
import com.application.model.Students;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       Students students =  context.getBean("students", Students.class);
        Course course = students.getCourse();
        System.out.println(students.getStudentId()+"\t"+students.getStudentAge()+"\t"+course.getCourseName());
        context.close();
    }
}
