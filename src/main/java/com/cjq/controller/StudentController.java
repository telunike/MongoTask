package com.cjq.controller;

import com.cjq.constant.Constant;
import com.cjq.entity.Student;
import com.cjq.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Constant.Api)
public class StudentController {

    private static final Logger Log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "添加学生信息", httpMethod = "POST")
    @RequestMapping(value = "/insertion", method = RequestMethod.POST)
    public Object insertInfo(@RequestBody Student student) {
        studentService.addStudentInfo(student);
        return null;
    }

    @ApiOperation(value = "修改学生信息", httpMethod = "POST")
    @RequestMapping(value = "/modifyInfo", method = RequestMethod.POST)
    public Object modifyInfo(@RequestBody Student student) {
        studentService.updateStudent(student);
        return null;
    }

    @ApiOperation(value = "删除学生信息", httpMethod = "DELETE")
    @RequestMapping(value = "/info", method = RequestMethod.DELETE)
    public Object deleteInfo(@RequestParam("stuno") String stuno) {
        studentService.removeStudent(stuno);
        return null;
    }

    @ApiOperation(value = "查询学生信息", httpMethod = "GET")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Object getInfoList() {
        List<Student> studentList =  studentService.getStudentList();
        studentList.forEach(stu -> Log.info(stu.toString()));
        return null;
    }
}
