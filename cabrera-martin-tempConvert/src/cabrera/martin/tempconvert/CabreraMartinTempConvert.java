/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabrera.martin.tempconvert;

/**
 *
 * @author Martin
 */
import java.util.Scanner;
public class CabreraMartinTempConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c1, faren;
        Scanner keyboard;
        // TODO code application logic here
        keyboard = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Celsius:");
        c1 = keyboard.nextDouble();
                  
        faren = (9.0/5.0)* c1 + 32;
        System.out.println("The temperature in Fahrenheit is " + faren);
        
        // TODO code application logic here
    }
    
}
