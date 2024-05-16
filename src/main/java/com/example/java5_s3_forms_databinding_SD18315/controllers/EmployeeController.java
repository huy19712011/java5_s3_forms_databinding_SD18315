package com.example.java5_s3_forms_databinding_SD18315.controllers;

import com.example.java5_s3_forms_databinding_SD18315.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @GetMapping(value = "/employee")
    public ModelAndView showForm() {
        return new ModelAndView("employeeHome", "employee", new Employee());
    }


    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(
            @ModelAttribute("employee") final Employee employee,
            final BindingResult bindingResult,
            final ModelMap modelMap
    ) {
            if (bindingResult.hasErrors()) {
                return "errors";
            }

            modelMap.addAttribute("name", employee.getName());
            modelMap.addAttribute("contactNumber", employee.getContactNumber());
            modelMap.addAttribute("office", employee.getOffice());
            modelMap.addAttribute("id", employee.getId());

            return "employeeView";
    }


}
