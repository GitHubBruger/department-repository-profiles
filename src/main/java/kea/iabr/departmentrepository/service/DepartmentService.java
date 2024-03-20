package kea.iabr.departmentrepository.service;

import kea.iabr.departmentrepository.model.Department;
import kea.iabr.departmentrepository.repository.DepartmentRepositoryJDBC;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepositoryJDBC repository;

    public DepartmentService(DepartmentRepositoryJDBC repository) {
        this.repository = repository;
    }

    public List<Department> findAll() {
        return repository.findAll();
    }

}
