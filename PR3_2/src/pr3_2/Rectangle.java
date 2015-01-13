/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 *
 * @author hgrove17
 */
public class Rectangle extends Shape {
    public int height;
    public int width;
    public Rectangle(int x, int y){
        height=x;
        width=y;
        String msg="Rectangle Construction Error";
        if (x==0||y==0){
            throw new IllegalArgumentException(msg);
        }
    }
    public double getArea(){return width*height;}
    public double getPerimeter(){return (2*width)+(2*height);}
}
