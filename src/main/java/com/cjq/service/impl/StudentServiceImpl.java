package com.cjq.service.impl;

import com.cjq.entity.Student;
import com.cjq.repo.StudentRepo;
import com.cjq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void addStudentInfo(Student student) {
        studentRepo.insert(student);

        Student temp = new Student();
        for (int i = 0; i < 50; i++) {
            temp.setName("tom" + i);
            temp.setStuno(i + "");
            temp.setAge(i + 20);
            temp.setAddress("beijing" + i);
            studentRepo.insert(temp);
        }
    }

    @Override
    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void removeStudent(String stuno) {
        studentRepo.deleteByStuno(stuno);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepo.findAll();
    }
}
