/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package underover;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hgrove17
 */
public class gamePlay {
    public List<User> users = new<User> ArrayList();
    List<String> list2= new<String>ArrayList();
    Random rand = new Random();
        public int die1;
        public int die2;
    public void savegame(){
        /**
 *
 * savegame writes user array to file
 */
        File f = new File("C:\\Users\\hgrove17\\Documents\\GitHub\\ClintonProjects\\underOver\\src\\underover\\accounts.txt");
    try{
    BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
    for (int i = 0; i < users.size();i++){
        String a =users.get(i).name;
        int b =users.get(i).money;
        wrtr.write(a+" "+b+"\n");
        System.out.println(a+" "+b+"\n");
        
    }wrtr.close();
    }
    catch(IOException ex){
        System.out.println("Oops.");
    }
}
    public void newuser(String b){
        User u = new User();
        u.money=500;
        u.name=b;
        users.add(u);
        /**
 *
 * cerates default user settings and adds to array
 */
    }
    public void loadgame() {
        /**
 *
 * loadgame to read users into an array to be accessed later
 */
        File f = new File("C:\\Users\\hgrove17\\Documents\\GitHub\\ClintonProjects\\underOver\\src\\underover\\accounts.txt");
    try{
       
    
    
    BufferedReader rdr = new BufferedReader(new FileReader(f));
    String line;
    while ((line = rdr.readLine())!= null){
    Pattern p = Pattern.compile(" ");
    Matcher m = p.matcher(line);    
    while (m.find()){
        String namee = line.substring(0,m.start());
        
        int moneyy = Integer.parseInt(line.substring(m.start()+1, line.length()));
        
        User e = new User();
        e.money=moneyy;
        e.name=namee;
        users.add(e);
        
    }
    

        
    }
    }
    catch(IOException ex){
            System.out.println("Oops.");
            }
    }
    public void rolldie(){
        die1=rand.nextInt(7) + 1;
        die2=rand.nextInt(7) + 1;
      /**
 *
 * random roll dice
 */
    }
    /**
 *
 * over under and equals logic methods to return bet with winnings or losings
 */
    public int over7(int x, int y, int z){
        if(x+y>7)
            return z*2;
        else return -z;
    }
    public int under7(int x, int y, int z){
        if(x+y<7)
            return z*2;
        else return -z;
    }
    public int exactly7(int x, int y, int z){
        if(x+y==7)
            return z*4;
        else return -z;
}
}
