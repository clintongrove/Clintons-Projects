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
public class PI {
    
    public double generatepi(double y){
    double j=3;
    double pi=4;
    for (int x=0;x<y;x++){
    
    pi+=(-(4/j)+(4/(j+2)));    
    j+=4;   
    
}return pi;
}
}
