package kea.iabr.departmentrepository.repository;

import kea.iabr.departmentrepository.model.Department;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepositoryJDBC {

    @Value("${spring.datasource.url}")
    private String db_url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String pwd;

    public List<Department> findAll() {
        List<Department> departments = new ArrayList<Department>();
        try (Connection con = DriverManager.getConnection(db_url, username, pwd)) {
            String SQL = "SELECT * FROM EMP_DEPT.DEPT;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                int deptNo = rs.getInt("DEPTNO");
                String name = rs.getString("DNAME");
                String location = rs.getString("LOC");
                departments.add(new Department(deptNo, name, location));
            }
            return departments;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //TO DO other CRUD methods

}
