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
        Connection connection = ConnectionManager.getConnection(db_url, username, pwd);
        String SQLQuery = "SELECT * FROM EMP_DEPT.DEPT;";

        try (PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int deptNo = resultSet.getInt("DEPTNO");
                String name = resultSet.getString("DNAME");
                String location = resultSet.getString("LOC");
                departments.add(new Department(deptNo, name, location));
            }
            return departments;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //TO DO other CRUD methods

}
