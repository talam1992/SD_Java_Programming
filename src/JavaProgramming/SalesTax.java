/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramming;

import java.util.Scanner;

/**
 *
 * @author Timothy Lam
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        
        double tax  = purchaseAmount * 0.06;
        System.out.println("Sales tax is £" + (int)(tax * 100)/100.0);
    }
}
