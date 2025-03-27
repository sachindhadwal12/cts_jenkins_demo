package com.stackroute.TestingDemo;

public class Employee {
    private String empName;
    private String password;
    private int age;

    public Employee(String empName, String password, int age) {
        this.empName = empName;
        this.password = password;
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean validatePassword(String password) {
       if(password.length()>=8){
           return true;
       }
       else{
           return false;
       }
    }
    public String ValidateUser(String userName, String password){
       if(userName==null || password==null){
           return "EmployeeName or Password cannot be null";
       }

        if(userName.equals("Admin") && password.equals("Password@123")){
            return "Admin User";
        }
        else{
            return "Normal User";
        }
    }
    public void checkAge() throws NegativeAgeException {
        if(age<18 ){
            throw new NegativeAgeException("Age is not valid");
        }
    }
}
