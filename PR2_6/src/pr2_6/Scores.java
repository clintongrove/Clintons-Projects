/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hgrove17
 */
public class Scores {
    ArrayList <Double> grades = new ArrayList();
    
    double bottom=100;
    double top=0;
    public double min(double x){
    if (bottom>x)
        bottom=x;
    return bottom;
    }
    public double max(double x){
    if (top<x)
        top=x;
    return top;
    }
    public double avg(double x){
        double sum=0;
        for(int i=0;i<grades.size();i++){
        sum+=grades.get(i);
        }
        return sum/grades.size();}
             
    public void addscore(double x){
        grades.add(x);
        
    }
}
