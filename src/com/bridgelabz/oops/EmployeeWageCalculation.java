package com.bridgelabz.oops;

public class EmployeeWageCalculation {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        //UC1-EMPLOYEE IS PRESENT OR ABSENT
        int a=(int)(Math.random()*2);
        if(a==1) {
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}
