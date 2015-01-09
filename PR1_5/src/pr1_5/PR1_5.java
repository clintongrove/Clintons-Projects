/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_5;
import java.util.Random;
/**
 *
 * @author hgrove17
 */
public class PR1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
            /**
     * @param random number generator
     */
        for (int i=0; i<25;i++){
                /**
     * @param looping with condition of 25 numbers
     */
        int x=rand.nextInt(100) + 1;
        int y=rand.nextInt(100) + 1;
            /**
     * @param generating random numbers
     */
        if (x>y){
            System.out.printf("%d greater than %d\n", x, y);
        }
        else if (x==y){
            System.out.printf("%d equal to %d\n", x, y);
        }
        else
            System.out.printf("%d less than %d\n", x, y);
        }
            /**
     * @param comparing random numbers using logic to determine order
     */
    }
    }
        
        
    
    
        
    
    

