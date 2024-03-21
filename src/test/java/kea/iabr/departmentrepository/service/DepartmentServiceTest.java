package kea.iabr.departmentrepository.service;

import kea.iabr.departmentrepository.model.Department;
import kea.iabr.departmentrepository.model.DepartmentIdComparator;
import kea.iabr.departmentrepository.repository.DepartmentRepositoryJDBC;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles({"dev", "test"})
class DepartmentServiceTest {

    @Autowired
    DepartmentService departmentService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() {
        List<Department> expectResult = List.of(
                new Department(10, "ACCOUNTING_H2", "NEW YORK"),
                new Department(20, "RESEARCH_H2", "DALLAS"),
                new Department(30, "SALES_H2", "CHICAGO"),
                new Department(40, "OPERATIONS_H2", "BOSTON"));

        List<Department> actualResult = departmentService.findAll();
        Collections.sort(actualResult, new DepartmentIdComparator());
        assertEquals(expectResult, actualResult);
    }
}