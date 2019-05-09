package com.cjq.repo;

import com.cjq.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 学生仓库类
 */
public interface StudentRepo extends MongoRepository<Student, String> {

    /**
     * 根据学号查询信息
     * @param stuno
     * @return
     */
    Student findByStuno(String stuno);

    /**
     * 根据学号删除学生
     * @param stuno
     */
    void deleteByStuno(String stuno);
}
