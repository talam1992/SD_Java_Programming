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
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter a radius
        System.out.println("Enter a number for a radius: ");
        double radius = input.nextDouble();
        
        //Compute area
        double area = radius * radius * 3.14159;
        
        //Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
