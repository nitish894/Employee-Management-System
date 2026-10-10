package com.nitish.emp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int id;
        Employeeint in=new Employeeimp();
        System.out.println("Welcome to our employee management console application");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Add Employee\n" + "2.Show all employee\n" +
                    "3.Show employee based on id\n" + " 4.update employee\n" + "5. Delete employee\n");

            // you can fill your choices
            System.out.println("enter your choice:");
            int ch=sc.nextInt();
            switch (ch){
                case 1:Employee emp=new Employee();
                    System.out.println("entre your id:");
                    id=sc.nextInt();
                    sc.nextLine(); // Consume the leftover newline
                    System.out.println("Enter you name:");
                    name=sc.nextLine();
                    System.out.println("Enter your salary:");
                    Double salary=sc.nextDouble();
                    System.out.println("enter your age:");
                    int age=sc.nextInt();
                    // then set their all things
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    in.createEmployee(emp);
                break;
                case 2:
                    in.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter your employee id");
                    int empid=sc.nextInt();
                    in.showEmployeeBasedOnId(empid);
                    break;
                case 4:
                    System.out.println("Enter your detail or ID");
                    int emid=sc.nextInt();
                    sc.nextLine(); // Consume the leftover newline
                    System.out.println("Enter your new name ");
                    name=sc.nextLine();
                    in.updateEmployee(emid,name);
                    break;
                case 5:
                    System.out.println("put the employee detail or id");
                     empid=sc.nextInt();
                     in.deleteEmployee(empid);
                     break;
                case 6:
                    System.out.println("tankyou for visit out application");
                    System.exit(0);
                default:
                    System.out.println("please enter the valid case");
                    break;
            }
        }while(true);
    }
}
