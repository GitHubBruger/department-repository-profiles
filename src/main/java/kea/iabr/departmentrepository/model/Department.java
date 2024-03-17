package kea.iabr.departmentrepository.model;

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

}
