/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Clinton
 */
public class Reviewer {
    public List<Restaurant> list = new <Restaurant> ArrayList();
    public String names="";
    int data;
        public void save(){
        /**
 *
 * save writes user array to file
 */
        File f = new File("C:\\Users\\Clinton\\Documents\\NetBeansProjects\\PR4_1\\src\\pr4_1\\List.txt");
    try{
    BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
    wrtr.write(data+"\n");
    for (int i = 0; i < list.size();i++){
        String a =list.get(i).name;
        double b =list.get(i).rating;
        String c=list.get(i).address;
        String d=list.get(i).notes;
        wrtr.write(a+"\n"+b+"\n"+c+"\n"+d+"\n");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
        
    }wrtr.close();
    }
    catch(IOException ex){
        System.out.println("Oops.");
    }
    list.clear();
    names = "";
    
}

    public void load() {
        /**
 *
 * load to read users into an array to be accessed later
 */
        File f = new File("C:\\Users\\Clinton\\Documents\\NetBeansProjects\\PR4_1\\src\\pr4_1\\List.txt");
    try{
    BufferedReader rdr = new BufferedReader(new FileReader(f));
    
    String line;
    line = rdr.readLine();
    data= Integer.parseInt(line);
    System.out.println(data);
    for (int i = 0; i < data; i++){

    String name1 = rdr.readLine();
    double rating1 = Double.parseDouble(rdr.readLine());  
    String address1 = rdr.readLine();
    String notes1 = rdr.readLine();
    Restaurant r = new Restaurant();
    r.rating=rating1;
    r.address=address1;
    r.notes=notes1;
    r.name=name1;
    names+=name1+"\n";
    list.add(r);
    System.out.println("added");
    }

    rdr.close();
    

        
    }
    catch(IOException ex){
            System.out.println("Oops.");
            }
    }
    
    public void addrestaurant(String address1,double rating1, String notes1, String name1){
    Restaurant r = new Restaurant();
    r.rating=rating1;
    r.address=address1;
    r.notes=notes1;
    r.name=name1;
    names+=name1+"\n";
    list.add(r);  
    data+=1;
    }
    public Restaurant findrestaurant(String name){
        int x=0;
        for (int i = 0; i <list.size();i++){
            if (name.equals(list.get(i).name))
              x=i;  
        }
        return list.get(x);
    }
}
