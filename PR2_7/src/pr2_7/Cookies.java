/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_7;

/**
 *
 * @author hgrove17
 */
public class Cookies {
    int TM=0;
    int SM=0;
    int CC=0;
    int total=0;
    public int addTM(){
        TM+=1;
        return TM;
    }
    public int addSM(){
        SM+=1;
        return SM;
    }
    public int addCC(){
        CC+=1;
        return CC;
    }
    public int total(){
        total=(TM*3)+(SM*4)+(CC*5);
        return total;
    }
}
