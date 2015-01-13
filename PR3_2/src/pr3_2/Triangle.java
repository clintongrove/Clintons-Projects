/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;
import java.util.*;
/**
 *
 * @author hgrove17
 */
public class Triangle extends Shape {
    public int s1;
    public int s2;
    public int s3;
    public Triangle(int x, int y,int z) throws IllegalArgumentException{
        
        s1=x;
        s2=y;
        s3=z;
        String msg="Triangle Construction Error";
        if (x>=y+z||y>=x+z||z>=x+y){
            throw new IllegalArgumentException(msg);
        }
        if (x==0||y==0||z==0){
            throw new IllegalArgumentException(msg);
        }
    }
    public double getArea(){
        double p=((s1+s2+s3)/2);
        double a=Math.sqrt(p*(p*s1)*(p*s2)*(p*s3));
    return a;}
    public double getPerimeter(){return s1+s2+s3;}
}
