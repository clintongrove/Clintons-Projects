/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_1;

/**
 *
 * @author hgrove17
 */
public class Gerbil {
    private int gerbilNumber;
    public Gerbil(int i){ gerbilNumber = i;}
    static void hop(Object x){
        Gerbil gerbil = (Gerbil)x;
        System.out.println("Gerbil "+gerbil.gerbilNumber+" is hopping.\n");
    }
}
