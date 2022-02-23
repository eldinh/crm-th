package com.crm.controller;

import com.crm.entity.Employee;
import com.crm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // add mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model model){
        List<Employee> employees = employeeService.findAll();
        // add to the spring model
        model.addAttribute("employees", employees);
        model.addAttribute("date", new Date());
        
        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        // create model attribute to bind form data
        model.addAttribute("employee", new Employee());

        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        // save the employee
        employeeService.save(employee);

        // user a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }
}
