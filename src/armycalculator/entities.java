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
     int hp = 1;
    /** Build time of the entity. In seconds*/
     int buildTime = 1;
    /** Cost of the entity. If more than one ressource is available, then this is the cost of the first ressource*/
     int ressource_cost_one =1;
    /** Cost of the entity, second ressource*/ 
     int ressource_cost_two =0;
    /** Cost of the entity, third ressource */ 
     int ressource_cost_three =0;
    
    // constructors
    /** Constructor using new name, hit points, build time and all three ressources costs */ 
    public entities (String newName, int newHP, int newBuildTime, int newRessourceCostOne, int newRessourceCostTwo, int newRessourceCostThree) {
    
        this.name = newName;
        this.hp = newHP;
        this.buildTime = newBuildTime;
        this.ressource_cost_one = newRessourceCostOne;
        this.ressource_cost_two = newRessourceCostTwo;
        this.ressource_cost_three = newRessourceCostThree;
    }
    
    /** Constructor using new name, hit points, build time and 2 ressources costs */ 
    public entities (String newName, int newHP, int newBuildTime, int newRessourceCostOne, int newRessourceCostTwo) {
    
        this.name = newName;
        this.hp = newHP;
        this.buildTime = newBuildTime;
        this.ressource_cost_one = newRessourceCostOne;
        this.ressource_cost_two = newRessourceCostTwo;      
    }
    
    /** Constructor using new name, hit points, build time and 1 ressource cost */ 
    public entities (String newName, int newHP, int newBuildTime, int newRessourceCostOne) {
    
        this.name = newName;
        this.hp = newHP;
        this.buildTime = newBuildTime;
        this.ressource_cost_one = newRessourceCostOne;
    }
    
    /** Constructor using new name and all other values are default to 1 */ 
    public entities (String newName) {
    
        this.name = newName;
    }
    
    // methods creations || getters
    /** Get the name of this entity */ 
    public String getName(){
    
        return this.name;
    }
    
    /** Get the current HP of this entity */ 
    public int getHP() {
    
        return this.hp;
    }
    
    /** Get the current Build time of this entity */ 
    public int getBuildTime() {
    
        return this.buildTime;
    }
    
    /** Get the current cost for the main ressource of this entity */ 
    public int getRessource_Cost_One() {
    
        return this.ressource_cost_one;
    }    
    
    /** Get the current cost of the secondary resource of this entity */ 
    public int getRessource_Cost_Two() {
    
        return this.ressource_cost_two;
    } 
    
    /** Get the current cost of the third resource of this entity, if any */
    public int getRessource_Cost_Three() {
    
        return this.ressource_cost_three;
    } 
    
    //methods creations || setters
    
    /** Change the name of this entity */
    public void setName(String newName){
    
        this.name = newName;
    }
    
    /** Change the amount of hitpoints of this entity */
    public void setHP(int newHP) {
    
        this.hp = newHP;
    }
    
    /** Change the amount of time to build this entity, in seconds */
    public void setBuildTime(int newTime) {
    
        this.buildTime = newTime;
    }
    
    /** Change the amount of the main ressource of this entity to be build */
    public void setRessource_Cost_One(int newCost) {
    
        this.ressource_cost_one = newCost;
    }    
    
    /** Change the amount of the secondary ressource of this entity to be build */
    public void setRessource_Cost_Two(int newCost) {
    
        this.ressource_cost_two = newCost;
    }   
    
    /** Change the amount of the third ressource of this entity to be build, if any */
    public void setRessource_Cost_Three(int newCost) {
    
        this.ressource_cost_three = newCost;
    }   
}
