package com.workshop.student.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping({ "", "/" })
    public String gelAll() {
        System.out.println("---- StudentController getAll()----");
        return "index";
    }

    @GetMapping("/{student-id}")
    public String getById(
            @PathVariable(name = "student-id") Integer studentId) {
        System.out.println("----StudentController getById() ----");
        System.out.println("student-id: " + studentId);
        return "index";
    }

    @GetMapping("/delete/{student-id}")
    public String getDeleteById(
            @PathVariable(name = "student-id") Integer studentId) {
        System.out.println("---- StudentController getDeleteById()----");
        System.out.println("student-id: " + studentId);
        return "index";
    }

    @PostMapping("/")
    public String postInsertAndUpdate(
            @RequestParam() Map<String, String> param) {
        System.out.println("---- StudentController postInsertAndUpdate()----");
        System.out.println("student-id: " + param.get("student-id"));
        System.out.println("student-name: " + param.get("student-name"));
        return "index";
    }
}
