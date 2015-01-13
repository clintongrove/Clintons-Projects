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
public class Ellipse extends Shape {
    public int r1;
    public int r2;
    public Ellipse(int x, int y){
        r1=x;
        r2=y;
        String msg="Ellipse Construction Error";
        if (x==0||y==0){
            throw new IllegalArgumentException(msg);
    }}
    public double getArea(){return (Math.PI)*r1*r2;}
    public double getPerimeter(){return 2*Math.PI *Math.sqrt(((r1*r1)+(r2*r2))/2);}
}