/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_3;

/**
 *
 * @author hgrove17
 */
public class PR1_3 {

    /**
     * args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String brand = "Versace";
        /**
         *
         *  initialize brand
         */
        if (args.length>0&&args[0].equalsIgnoreCase("new"))
                brand="Louis Vuitton";
          /**
         *
         * @param change argument for different string input with <code>if</code> and <code>else if</code> statements
         */
        else if (args.length>0&&args[0].equalsIgnoreCase("newer"))
                brand="Chanel";
        else if (args.length>0&&args[0].equalsIgnoreCase("newer yet"))
                brand="Marc Jacobs";
        System.out.println(brand);
        /**
         *
         * @param prints argument
         */
    }
    
}
