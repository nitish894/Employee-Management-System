package com.nitish.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employeeimp implements Employeeint {
    Connection con;
    @Override
    public void createEmployee(Employee emp) {
        con=DBConnection.createDBConnection();
        String query="insert into employeeDB values(?,?,?,?)";
        try{
            PreparedStatement pstm= con.prepareStatement(query);
            pstm.setInt(1,emp.getId());
            pstm.setString(2,emp.getName());
            pstm.setDouble(3,emp.getSalary());
            pstm.setInt(4,emp.getAge());
            int count=pstm.executeUpdate();
            if (count != 0){
                System.out.println("inserted successfully");
            }
            else{
                System.out.println("please try again");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void showAllEmployee() {
        con=DBConnection.createDBConnection();
        String query="Select * from employeeDB";
        System.out.println("Employee detail:");
        System.out.println("---------------------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\n","ID","NAME","SALARY","AGE");
        System.out.println("---------------------------------------------------");
        try{
            Statement stm= con.createStatement();
            ResultSet result= stm.executeQuery(query);
            while(result.next()){
                System.out.format("%d\t%s\t%.3f\t%d\n",result.getInt(1),
                        result.getString(2),result.getDouble(3),
                        result.getInt(4));
                System.out.println("---------------------------------------------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void showEmployeeBasedOnId(int id) {
        con=DBConnection.createDBConnection();
        String query="Select * from employeeDB where id="+ id;
        System.out.println("Employee detail:");
        System.out.println("---------------------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\n","ID","NAME","SALARY","AGE");
        System.out.println("---------------------------------------------------");
        try{
            Statement stm= con.createStatement();
            ResultSet result= stm.executeQuery(query);
            while(result.next()){
                System.out.format("%d\t%s\t%.3f\t%d\n",result.getInt(1),
                        result.getString(2),result.getDouble(3),
                        result.getInt(4));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name) {
    con=DBConnection.createDBConnection();
    String query="update employeeDB set name=?  where id=?";
    try{
       PreparedStatement pstm=con.prepareStatement(query);
        pstm.setString(1,name);
        pstm.setInt(2,id);
        int count=pstm.executeUpdate();
        if (count != 0){
            System.out.println("Detail will updated  successfully!!");
        }else{
            System.out.println("have an technical error we will resolved," +
                    " as soon as possible and than youthful for your cooperation");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    }

    @Override
    public void deleteEmployee(int id) {
       con=DBConnection.createDBConnection();
       String query="delete from employeeDB where id=?";
       try{
           PreparedStatement pstm= con.prepareStatement(query);
           pstm.setInt(1,id);
           int count= pstm.executeUpdate();
           if(count !=0 ){
               System.out.println("it deleted successfully!!");
           }else{
               System.out.println("have an some technical glitch please wait and try after sometime");
           }
       }catch(Exception e){
           e.printStackTrace();
        }
    }
}
