/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;
import java.util.*;
/**
 *
 * @author hgrove17
 */
public class PR2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Map<String, Gerbil> gerbils= new HashMap<String, Gerbil>();
      gerbils.put("Frank", new Gerbil(1));
      gerbils.put("Garry", new Gerbil(2));
      gerbils.put("Jerry", new Gerbil(3));
      Iterator<String> it = gerbils.keySet().iterator();
      while (it.hasNext()){
          String s=it.next();
          System.out.print(s+": ");
          gerbils.get(s).hop();
          
      }
    }
    
}
