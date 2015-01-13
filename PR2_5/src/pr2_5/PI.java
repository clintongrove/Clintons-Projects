/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_5;

/**
 *
 * @author hgrove17
 */

//PT -- again, reuse this class.
public class PI {
    static double generatepi(double c){
    double j=3;
    double pi=4;
    for (int x=0;x<c;x++){
    
    pi+=(-(4/j)+(4/(j+2)));    
    j+=4;   
    
}return pi;
}
}
