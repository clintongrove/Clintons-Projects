/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;

/**
 *
 * @author hgrove17
 */
//Reuse from PR2_1 -2
public class Gerbil {
    public int gerbilNumber;
    public Gerbil(){};
        public Gerbil(int i){
            gerbilNumber = i;
            
        }
        
        //PT -- javadocs here -2
   void hop(){
       System.out.println("Gerbil No. " +gerbilNumber +" is hopping.\n");
   }
           
}
