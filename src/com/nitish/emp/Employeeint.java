package com.nitish.emp;

public interface Employeeint {
    // create employee
    public void createEmployee(Employee emp);
    //show all employee
    public void showAllEmployee();
    // show employee based on id
    public void showEmployeeBasedOnId(int id);
    //update Employee
    public void updateEmployee(int id,String name);
    //delete employee
    public void deleteEmployee(int id);
}
