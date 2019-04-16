package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employeeNumber: ");
        int employeeNumber = scanner.nextInt();
        System.out.print("what is your payRate /hr: ");
        int payRate = scanner.nextInt();
        System.out.print("enter numberOfHrs worked: ");
        int numberOfHrs = scanner.nextInt();

        int maximumHr = 60;
        double maximumHourlyRate = 25.0;
        int overtime = numberOfHrs - 35;
        double weeklyPay = (payRate * numberOfHrs);

        if (numberOfHrs  > maximumHr || payRate > maximumHourlyRate){
            System.out.println("field is out of range");
            weeklyPay = 0;
        } else if(numberOfHrs > 35){
            weeklyPay = (payRate * (numberOfHrs - overtime)) + (overtime * (payRate * 1.5));
        }
        else {
            weeklyPay = (payRate * numberOfHrs);
        }
        System.out.println("employeeNumber: " + employeeNumber +" payRate is: " +  payRate + "/hrs"+ " numberOfHrs wroked is: " + numberOfHrs +  " weeklyPay = " + weeklyPay);
    }
}
