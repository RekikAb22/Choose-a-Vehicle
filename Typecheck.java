/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

/**
 *
 * @author Black
 */
public class Typecheck extends Exception {
    public Typecheck()
    {
        System.out.println("Invalid choice");
        System.out.println("Please choose among the following only: ");
        System.out.println("Airbus-380");
        System.out.println("Boeng-777");
        System.out.println("Boeng-747");
        System.out.println("Airbus-340");
        System.out.println("Airbus-330");
    }
    
}
