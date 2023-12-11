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
public class Sizechecker extends Exception {
    public Sizechecker()
    {
        System.out.println("Unknown size");
        System.out.println("Please Choose among the following sizes only");
        System.out.println("Handymax");
        System.out.println("Aframax");
        System.out.println("Panamax");
        System.out.println("Suezmax");
        System.out.println("Capesize");
        System.out.println("VLCC");
    }
}
