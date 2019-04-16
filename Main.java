package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String customerName = scanner.nextLine();
        System.out.print("what is the purchase amount: ");
        int purchaseAmount = scanner.nextInt();
        System.out.print("enter tax code(0-3): ");
        int taxCode = scanner.nextInt();
        double tax;
        if (taxCode == 0){
            tax = 1;
        } else if  (taxCode == 1){
            tax = 0.03;
        } else if  (taxCode == 2){
            tax = 0.05;
        } else {
            tax = 0.07;
        }
        double totalAmount = Math.floor(purchaseAmount * tax);
        System.out.println("Customer Name is: " + customerName +" Purchase Amount is: " +  purchaseAmount + " taxCode is: " + taxCode +  " the totalAmount = " + totalAmount);
    }
}
