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
public class Monster {
    private String name; //Nombre del monstruo
    private int combatLevel; //Nivel de combate del monstruo
    
    private Prize prize;
    private BadConsequence bad;
    
    public Monster(String name, int level, BadConsequence bc, Prize prize){
        this.name=name;
        this.combatLevel=level;
        this.prize=prize;
        this.bad=bc;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCombatLevel(){
        return this.getCombatLevel();
    }
    
    public Prize getPrize(){
        return prize;
    }
    
    public BadConsequence getBadConsequence(){
        return bad;
    }
    
    @Override
    public String toString(){
        return "Name = " + name + " levels = " + Integer.toString(combatLevel) + " Prize: " + prize.toString()
                + " BadConsequence: " + bad.toString();
    }
}
    
