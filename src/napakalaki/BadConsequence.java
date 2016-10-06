/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author inma
 */
public class BadConsequence {
    private String text; //Representa lo que dice un mal rollo
    private int levels; //Representa los niveles que se pierden
    private int nVisibleTreasures; //Representa el numero de tesoros visibles que se pierden
    private int nHiddenTreasures;//Representa el numero de tesoros ocultos que se pierden
    private boolean death;//Representa el mal rollo de tipo muerte
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text= text;
        this.levels=levels;
        this.nVisibleTreasures=nVisible;
        this.nHiddenTreasures=nHidden;
    }
    
    public BadConsequence(String text, boolean death){
        this.text=text;
        this.death=death;
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden){
        this.text=text;
        this.levels=levels;
        this.specificHiddenTreasures=tHidden;
        this.specificVisibleTreasures=tVisible;
    }
    
    public String getText(){
        return this.text;
    }
    
    public int getLevels(){
        return this.levels;
    }
    
    public int getNVisible(){
        return this.nVisibleTreasures;
    }
    
    public int getNHidden(){
        return this.nHiddenTreasures;
    }
    
    public boolean getDeath(){
        return this.death;
    }
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures(){
        return this.specificHiddenTreasures;
    }
    
    public ArrayList<TreasureKind> getSpecificVisibleTreasures(){
        return this.specificVisibleTreasures;
    }
    
    @Override
    public String toString(){
        return "Text = " + text + " levels = " + Integer.toString(levels) + " nVisibleTreasures: " + Integer.toString(nVisibleTreasures)
                + " nHiddenTreasures: " + Integer.toString(nHiddenTreasures) + " death: ";
    }
    
}
