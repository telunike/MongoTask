package com.cjq.service;

import com.cjq.entity.Student;

import java.util.List;

/**
 * student服务类
 */
public interface StudentService {

    /**
     * 添加单个学生信息
     * @param student
     */
    void addStudentInfo(Student student);

    /**
     * 更新信息
     * @param student
     */
    void updateStudent(Student student);

    /**
     * 删除信息
     * @param stuno
     */
    void removeStudent(String stuno);

    /**
     * 获取信息
     * @return
     */
    List<Student> getStudentList();
}
