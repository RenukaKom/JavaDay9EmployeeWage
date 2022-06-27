package com.bridgelabz.employeewages;
//Calculate Daily Employee Wage
public class EmployeeWagesUC2 {
    public static void main(String[] args) {
        DailyWages wage = new DailyWages();
        wage.calculateSalary();
    }
}
class DailyWages{
    public void calculateSalary() {
    double empCheck = Math.floor(Math.random() * 10 % 2);
        System.out.println(empCheck);
        int isFullTime = 1;
        double empRatePerHour =20;
        if (empCheck == isFullTime) {
            int empFullHrs = 8;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println("Salary is " + salary);
        } else {
            int empFullHrs = 0;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println("Salary is " + salary);
        }
    }
}