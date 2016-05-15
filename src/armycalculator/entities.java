/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armycalculator;

/**
 *
 * @author Greg
 */
public class entities {
    
    //Variables & Constant declaration + init
    
    /** Name of the entity*/
     String name ="";
    /** Hit Points of the entity*/
     int hp = 0;
    /** Build time of the entity. In seconds*/
     int buildTime = 0;
    /** Cost of the entity. If more than one ressource is available, then this is the cost of the first ressource*/
     int ressource_cost_one =0;
    /** Cost of the entity, second ressource*/ 
     int ressource_cost_two =0;
    /** /** Cost of the entity, third ressource */ 
     int ressource_cost_three =0;
    
    // constructors
    
    public entities (String newName, int newHP, int newBuildTime, int newRessourceCostOne, int newRessourceCostTwo, int newRessourceCostThree) {
    
        this.name = newName;
        this.hp = newHP;
        this.buildTime = newBuildTime;
        this.ressource_cost_one = newRessourceCostOne;
        this.ressource_cost_two = newRessourceCostTwo;
        this.ressource_cost_three = newRessourceCostThree;
    }
    
    public entities (String newName, int newHP, int newBuildTime, int newRessourceCostOne, int newRessourceCostTwo) {
    
        this.name = newName;
        this.hp = newHP;
        this.buildTime = newBuildTime;
        this.ressource_cost_one = newRessourceCostOne;
        this.ressource_cost_two = newRessourceCostTwo;      
    }
    
    public entities (String newName, int newHP, int newBuildTime, int newRessourceCostOne) {
    
        this.name = newName;
        this.hp = newHP;
        this.buildTime = newBuildTime;
        this.ressource_cost_one = newRessourceCostOne;
    }
    
    // methods creations || getters
    public String getName(){
    
        return this.name;
    }
    
    public int getHP() {
    
        return this.hp;
    }
    
    public int getBuildTime() {
    
        return this.buildTime;
    }
    
    public int getRessource_Cost_One() {
    
        return this.ressource_cost_one;
    }    
    
    public int getRessource_Cost_Two() {
    
        return this.ressource_cost_two;
    } 
    
    public int getRessource_Cost_Three() {
    
        return this.ressource_cost_three;
    } 
    
    //methods creations || setters
    
    public void setName(String newName){
    
        this.name = newName;
    }
    
    public void setHP(int newHP) {
    
        this.hp = newHP;
    }
    
    public void setBuildTime(int newTime) {
    
        this.buildTime = newTime;
    }
    
    public void setRessource_Cost_One(int newCost) {
    
        this.ressource_cost_one = newCost;
    }    
    
    public void setRessource_Cost_Two(int newCost) {
    
        this.ressource_cost_two = newCost;
    }   
    
    public void setRessource_Cost_Three(int newCost) {
    
        this.ressource_cost_three = newCost;
    }   
}
