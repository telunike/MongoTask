package com.cjq.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * 学生实体类
 */
@Data
@Document(collection = "user")
public class Student {

    private String stuno;

    private String name;

    private Integer age;

    private String address;

    private List<String> hobby;
}
