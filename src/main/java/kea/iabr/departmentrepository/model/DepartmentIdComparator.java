package kea.iabr.departmentrepository.model;

import java.util.Comparator;

public class DepartmentIdComparator implements Comparator<Department> {
    @Override
    public int compare(Department department1, Department department2) {
        return Integer.compare(department1.getDeptNo(), department2.getDeptNo());
    }
}
