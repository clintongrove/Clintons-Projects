/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;

/**
 *
 * @author hgrove17
 */
public class PR3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        input q = new input();
        try {
        q.addInts();
        }
        catch (Exception InputMismatchException){
            System.out.println(""
                    + "Not an Interger Value.");
        }
        q.calculations();
    }
    
}
