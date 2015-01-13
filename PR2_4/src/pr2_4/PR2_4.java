/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_4;

/**
 *
 * @author hgrove17
 */
public class PR2_4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PI pi = new PI();
        //PT -- Check that there's an argument on the command line. Don't assume there is. -2
        double value = Double.parseDouble(args[0]);
         System.out.println("Pie is "+pi.generatepi(value));
      
        
    }
    
}
