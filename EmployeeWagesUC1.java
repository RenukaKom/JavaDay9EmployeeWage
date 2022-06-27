package com.bridgelabz.employeewages;
//Check Employee is Present or Absent
public class EmployeeWagesUC1 {
    public static void main(String[] args) {
        PresentAbsent attendance = new PresentAbsent();
        attendance.checkPresentAbsent();
    }
}
class PresentAbsent{
    public void checkPresentAbsent(){
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        if (empCheck == isFullTime) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}