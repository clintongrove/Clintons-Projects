/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_4;
import java.util.Scanner;
/**
 *
 * @author hgrove17
 */
public class PR1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI = 3.14159265359;
        /**
         *
         * @param initialize pi to value of pie
         */
        System.out.println("Please enter the radius of a circle.");
        /**
         *
         * @param prompt user for radius
         */
        Scanner input = new Scanner(System.in);
       
        double rad = input.nextDouble();
         /**
         *
         * @param processing user input
         */
        rad=(rad*rad)*PI;
        /**
         *
         * @param calculating area of circle based on radius
         */
        System.out.printf("The area of your circle is %f\n", rad);
        /**
         *
         * @param printing area
         */
    }
    
}
