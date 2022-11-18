package com.peaksoft.controller;

import com.peaksoft.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping("/allCourse")
    public String getAllCourse(Model model) {
        model.addAttribute("allCourse", courseService.getAllCourse());
        return "/course/get_all_course";
    }


}
