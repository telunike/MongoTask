package com.cjq.service.impl;

import com.cjq.entity.Student;
import com.cjq.repo.StudentRepo;
import com.cjq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void addStudentInfo(Student student) {
        studentRepo.insert(student);
    }
}
