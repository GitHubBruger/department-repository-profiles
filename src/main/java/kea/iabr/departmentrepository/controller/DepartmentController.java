package kea.iabr.departmentrepository.controller;

import kea.iabr.departmentrepository.model.Department;
import kea.iabr.departmentrepository.repository.DepartmentRepositoryJDBC;
import kea.iabr.departmentrepository.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "depts")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("")
    public String findAll(Model model) {
        List<Department> departments = departmentService.findAll();
        model.addAttribute("departments", departments);

        return "departments";
    }

}
