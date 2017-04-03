/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramming;

/**
 *
 * @author Timothy Lam
 */
public class ComputeArea {
    public static void main(String[] args) {
        double radius;// Declare radius
        double area; // Declare area
        
        //Assign a radius
        radius = 20; // radius is now 20
        
        //Compute area
        area = radius * radius * 3.14159;
        
        //Display result
        System.out.println("This area for a circle of radius " + 
                radius + " is " + area);
        
    }
}
