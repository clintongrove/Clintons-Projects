/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_6;

/**
 *
 * @author hgrove17
 */
public class PR1_6 {

    /**
     * @param uses two <code>for</code> loops and logic to check for prime numbers and print them out up to 10000
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0;
            /**
     * nested for loops with variable to store possible prime numbers
     */
        for (int i=1;i<=10000;i++){
            for (int j=1;j<=10000;j++){
                if (i%j==0&&i!=j&&j!=1){
                        /**
     * breaks loop when prime is found
     */
                 break;   
                }
                if (i==j)
                    if ((++x)%1==0)
                            /**
     * checking and printing prime number
     */
                        System.out.println(i);
                }
            }
        }
    }
    
