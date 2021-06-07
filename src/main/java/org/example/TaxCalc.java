/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args){
        double amount, tax=0, total=0;
        System.out.println("What is the order amount?");
        Scanner scanner = new Scanner(System.in);
        String newamount = scanner.next();
        System.out.println("What is the State?");
        Scanner scanner1 = new Scanner(System.in);
        String newstate = scanner1.next();
        amount = Double.parseDouble(newamount);
        if( newstate.contentEquals("WI")){
            tax = amount * .055;
            total = amount + tax;
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            Math.ceil(total);
            System.out.println("The subtotal is $" + amount + ".\n " + "The tax is $" + tax + ".\n" + "The total is $" + numberFormat.format(total));

        }
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("The total is " + amount);
    }
}
