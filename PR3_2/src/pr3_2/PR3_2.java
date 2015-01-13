/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hgrove17
 */
public class PR3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Integer> values = new <Integer> ArrayList();
        
        int shapesides=0;
        String whatshape;
        System.out.println("Rectangle(1), Ellipse(2), Triangle(3)");
        Scanner input = new Scanner(System.in);
        int shapechoice=input.nextInt();
        switch (shapechoice){
        case 1: whatshape= "Please Enter the height and width of your Rectangle";
        shapesides=2;
        break;
        case 2: whatshape= "Please Enter the radii of your Ellipse";
        shapesides=2;
        break;
        case 3: whatshape = "Please Enter the three sides of your Triangle";
        shapesides=3;
        break; 
        default: whatshape="Error";
            shapesides=0;
            break;
    }
   System.out.println(whatshape);
        int q=0;
        for(int i = 0; i<shapesides;i++){
        q = input.nextInt();
        values.add(q);
        }
       try{
        switch (shapechoice){
        case 1:Rectangle rec = new Rectangle(values.get(0),values.get(1));
        System.out.printf("Area:%f", rec.getArea());
        System.out.printf("Perimeter:%f", rec.getPerimeter());
        break;
        case 2: Ellipse ell = new Ellipse(values.get(0),values.get(1));
        System.out.printf("Area:%f", ell.getArea());
        System.out.printf("Perimeter:%f", ell.getPerimeter());
        break;
        case 3:Triangle tri = new Triangle(values.get(0),values.get(1),values.get(2));
        System.out.printf("Area:%f", tri.getArea());
        System.out.printf("Perimeter:%f", tri.getPerimeter());
        break; 
        default: System.out.println("Error");
            break;
    }
       
       }
       catch(IllegalArgumentException ex){
           System.out.printf("Oops, something happened: %s", ex.getMessage());
       }
    }
    }

