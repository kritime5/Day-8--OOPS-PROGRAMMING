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

            //VARIABLES
            int empHrs=0;
            int empWage=0;

            empWage=empHrs*EMP_WAGE_PER_HOUR;
            System.out.println("Emp Wage:"+empWage);

            //UC3-ADD PART TIME EMPLOYEE AND WAGE-PART TIME HR IS 8
            //CONSTANTS
            int IS_PART_TIME=1;
            int IS_FULL_TIME=2;

            if(a==1) {
                System.out.println("The employee is present");
                if(a==IS_PART_TIME)
                    empHrs=4;
                else if (a==IS_FULL_TIME)
                    empHrs=8;
            }else {
                System.out.println("Employee is absent");
                empHrs=0;
            }

        }
    }
}
