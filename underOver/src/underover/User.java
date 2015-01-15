/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package underover;

/**
 *
 * @author hgrove17
 */
public class User {
    public int bet;
    public String name;
    public int money;
/**
 *
 * user with values
 */
    
    public int updatebalance(int z){
        money+=z;
        return money;
    }
 /**
 *
 * users balance can be updated
 */   
}
