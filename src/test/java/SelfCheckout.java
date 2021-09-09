/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String [] args) {
        //declaring variables:
        int StItemQuantity; //first item quantity
        int NdItemQuantity; //second item quantity
        int RdItemQuantity; //third item quantity

        double StItemPrice; //first item price
        double NdItemPrice; //second item price
        double RdItemPrice; //third item price

        double tax, total, subtotal; //will be used for calculations

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        StItemPrice = reader.nextDouble(); //ask for input
        System.out.print("Enter the quantity of item 1: ");
        StItemQuantity = reader.nextInt(); //ask for input

        System.out.print("Enter the price of item 2: ");
        NdItemPrice = reader.nextDouble(); //ask for input
        System.out.print("Enter the quantity of item 2: ");
        NdItemQuantity = reader.nextInt(); //ask for input

        System.out.print("Enter the price of item 3: ");
        RdItemPrice = reader.nextDouble(); //ask for input
        System.out.print("Enter the quantity of item 3: ");
        RdItemQuantity = reader.nextInt(); //ask for input

        subtotal = (StItemQuantity * StItemPrice) + (NdItemQuantity * NdItemPrice) + (RdItemQuantity * RdItemPrice);
        tax = (subtotal * 5.5) / 100; //will calculate the tax
        total = subtotal + tax; //total after adding up tax

        //printing the results after calculations:
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }

}
