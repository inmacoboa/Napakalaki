/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author inma
 */
public class Prize {
    private int treasures;
    private int level;
    
    Prize(int treasures, int level){
        this.treasures=treasures;
        this.level=level;
    }
    
    public int getTreasures(){
        return this.treasures;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    @Override
    public String toString(){
        return "Treasures = " + Integer.toString(treasures) + " levels = " + Integer.toString(level);
    }
    
}
