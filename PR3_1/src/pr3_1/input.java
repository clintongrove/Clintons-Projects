/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;
import java.util.*;
/**
 *
 * @author hgrove17
 */
public class input {
    List <Integer> values = new <Integer> ArrayList();
    int max=0;
    int min;
    public void addInts(){
        int x=0;
        System.out.println("Please Enter an Interger Value.");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<10;i++){
        x = input.nextInt();
       
        
        values.add(x);
        
        }
        }
   public void calculations(){
       int min=0;
       int max=0;
       double avg=0;
       double sum=0;
       for(int i=0;i<values.size();i++){
       int x=values.get(i);    
       sum+=x;
       min=x;
        if (max<x){
            max=x;
        }
        if (min>x){
            min=x;
        }
       }
       avg= sum/values.size();
       System.out.println("Avg: "+ avg);
       System.out.println("Max: "+max);
       System.out.println("Min: "+min);
   }
             
    } 
    
    
