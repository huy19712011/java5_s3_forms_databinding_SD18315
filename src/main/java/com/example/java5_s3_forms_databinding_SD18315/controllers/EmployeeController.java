package com.example.java5_s3_forms_databinding_SD18315.controllers;

import com.example.java5_s3_forms_databinding_SD18315.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @GetMapping(value = "/employee")
    public ModelAndView showForm() {
        return new ModelAndView("employeeHome", "employee", new Employee());
    }
}
