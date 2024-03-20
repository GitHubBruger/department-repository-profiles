package kea.iabr.departmentrepository.model;

import java.util.Objects;

public class Department {
    private int deptNo;
    private String name;
    private String location;

    public Department(int deptNo, String name, String location) {
        this.deptNo = deptNo;
        this.name = name;
        this.location = location;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return deptNo == that.deptNo && Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptNo, name, location);
    }
}
