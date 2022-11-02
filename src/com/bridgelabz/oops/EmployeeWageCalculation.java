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
            //UC2-CALCULATE EMPLOYEE WAGE
            // WAGE-given wage per hr is 20 and full day hr is 8
            //CONSTANTS
            int EMP_WAGE_PER_HOUR=20;
            int IS_FULL_TIME=1;
            //VARIABLES
            int empHrs=0;
            int empWage=0;

            empWage=empHrs*EMP_WAGE_PER_HOUR;
            System.out.println("Emp Wage:"+empWage);

        }
    }
}
