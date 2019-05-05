package com.cjq;

import com.cjq.entity.Student;
import com.cjq.service.StudentService;
import com.cjq.service.impl.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        StudentService studentService = context.getBean(StudentServiceImpl.class);

        Student student = new Student();
        student.setName("zhangsan");
        student.setAddress("beijing");
        student.setAge(12);
        student.setStuno("1");

        studentService.addStudentInfo(student);

    }
}
