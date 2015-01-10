/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PR1_1;

/**
 *
 * @author hgrove17
 */
class DataOnly {
  int i;
  float f;
  boolean b;
}
public class PR1_1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
 
  
  DataOnly d = new DataOnly();
  d.i = 47;
d.f = 1.1f; // ‘f’ after number indicates float constant
d.b = false;
System.out.printf("%d %f %b\n", d.i, d.f, d.b);
}
    }
    

