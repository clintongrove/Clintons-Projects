/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author hgrove17
 */
public class PR2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List herdOfGerbils = new ArrayList();
        for(int i = 0; i < 3; i++){
      herdOfGerbils.add(new Gerbil(i));    
        }
        Iterator e = herdOfGerbils.iterator();
        while(e.hasNext())
            Gerbil.hop(e.next());
            
}        
    
}

