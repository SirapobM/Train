package com.workshop.student.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/course")
public class CourseController {

    @GetMapping({ "", "/" })
    public String gelAll() {
        System.out.println("---- CourseController getAll()----");
        return "index";
    }

    @GetMapping("/{course-id}")
    public String getById(
            @PathVariable(name = "course-id") Integer courseId) {
        System.out.println("----CourseController getById() ----");
        System.out.println("course-id " + courseId);
        return "index";
    }

    @GetMapping("/delete/{course-id}")
    public String getDeleteById(
            @PathVariable(name = "course-id") Integer courseId) {
        System.out.println("---- CourseController getDeleteById()----");
        System.out.println("course-id " + courseId);
        return "index";
    }

    @PostMapping("/")
    public String postInsertAndUpdate(
            @RequestParam() Map<String, String> param) {
        System.out.println("---- CourseController postInsertAndUpdate()----");
        System.out.println("course-id " + param.get("course-id"));
        System.out.println("course-name: " + param.get("course-name"));
        return "index";
    }
}
