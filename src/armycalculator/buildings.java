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
public class buildings extends entities {
    
    //Variables & Constant declaration + init
    // By default, it is Air Only
    
     Boolean canMove = false;
     Boolean canHitGround = false;
     Boolean canHitAir = true;
     int damageTypeGround = 0;
     int damageTypeAir = 0;
     int damageValueGround = 0;
     int damageValueAir = 0;
     Boolean canBeRepaired = false;
     Boolean canBeSold = false;
     int valueSold = 0;
     int rateOfFire = 0;
     int reloadTime = 0;
    
    // constructors
    
    //air and ground 3 ressources 
     /** Constructor for a unit attacking air and ground and with a 3 ressources cost
     * @param newName
     * @param newHP
     * @param newRT
     * @param newBuildTime
     * @param newRessourceCostTwo
     * @param newRessourceCostThree
     * @param newRessourceCostOne
     * @param moveable
     * @param targetAir
     * @param targetGround
     * @param newDamageTypeGround
     * @param sellItPossible
     * @param valueToSell
     * @param repairPossible
     * @param newDamageTypeAir
     * @param newDamageValueAir
     * @param newDamageValueGround
     * @param newROF */
    public buildings(String newName, int newHP, int newBuildTime, int newRessourceCostOne, int newRessourceCostTwo, int newRessourceCostThree, Boolean moveable, Boolean targetGround, Boolean targetAir, int newDamageTypeGround, int newDamageTypeAir, int newDamageValueGround, int newDamageValueAir, Boolean repairPossible, Boolean sellItPossible, int valueToSell, int newROF, int newRT){
    
        super(newName,newHP,newBuildTime,newRessourceCostOne,newRessourceCostTwo,newRessourceCostThree);
        this.canMove = moveable;
        this.canHitGround = targetGround;
        this.canHitAir = targetAir;
        this.damageTypeGround = newDamageTypeGround;
        this.damageTypeAir = newDamageTypeAir;
        this.damageValueGround = newDamageValueGround;
        this.damageValueAir = newDamageValueAir;
        this.canBeRepaired = repairPossible;
        this.canBeSold = sellItPossible;
        this.valueSold = valueToSell;
        this.rateOfFire = newROF;
        this.reloadTime = newRT;
        
    }
    //ground only 3 ressources
    /** Constructor for a unit attacking ground only and with a 3 ressources cost
     * @param newName
     * @param newHP
     * @param newBuildTime
     * @param newRessourceCostOne
     * @param newDamageTypeGround
     * @param newRessourceCostThree
     * @param newRessourceCostTwo
     * @param newROF
     * @param targetGround
     * @param moveable
     * @param newRT
     * @param sellItPossible
     * @param repairPossible
     * @param newDamageValueGround
     * @param valueToSell */
    public buildings(String newName, int newHP, int newBuildTime, int newRessourceCostOne, int newRessourceCostTwo, int newRessourceCostThree, Boolean moveable, Boolean targetGround, int newDamageTypeGround, int newDamageValueGround, Boolean repairPossible, Boolean sellItPossible, int valueToSell, int newROF, int newRT){
    
        super(newName,newHP,newBuildTime,newRessourceCostOne,newRessourceCostTwo,newRessourceCostThree);
        this.canMove = moveable;
        this.canHitGround = targetGround;
        this.damageTypeGround = newDamageTypeGround;
        this.damageValueGround = newDamageValueGround;
        this.canBeRepaired = repairPossible;
        this.canBeSold = sellItPossible;
        this.valueSold = valueToSell;
        this.rateOfFire = newROF;
        this.reloadTime = newRT;
        
    }
    //air and ground 2 ressources 
    /** Constructor for a unit attacking air and ground and with a 2 ressources cost
     * @param newName
     * @param newHP
     * @param newBuildTime
     * @param newRessourceCostOne
     * @param targetGround
     * @param newRessourceCostTwo
     * @param newDamageValueAir
     * @param moveable
     * @param newRT
     * @param newDamageTypeGround
     * @param sellItPossible
     * @param targetAir
     * @param newDamageValueGround
     * @param newDamageTypeAir
     * @param repairPossible
     * @param newROF
     * @param valueToSell */
    public buildings(String newName, int newHP, int newBuildTime, int newRessourceCostOne, int newRessourceCostTwo, Boolean moveable, Boolean targetGround, Boolean targetAir, int newDamageTypeGround, int newDamageTypeAir, int newDamageValueGround, int newDamageValueAir, Boolean repairPossible, Boolean sellItPossible, int valueToSell, int newROF, int newRT){
    
        super(newName,newHP,newBuildTime,newRessourceCostOne,newRessourceCostTwo);
        this.canMove = moveable;
        this.canHitGround = targetGround;
        this.canHitAir = targetAir;
        this.damageTypeGround = newDamageTypeGround;
        this.damageTypeAir = newDamageTypeAir;
        this.damageValueGround = newDamageValueGround;
        this.damageValueAir = newDamageValueAir;
        this.canBeRepaired = repairPossible;
        this.canBeSold = sellItPossible;
        this.valueSold = valueToSell;
        this.rateOfFire = newROF;
        this.reloadTime = newRT;
        
    }
    //ground only 2 ressources
    /** Constructor for a unit attacking on ground only and with a 2 ressources cost
     * @param newName
     * @param newHP
     * @param newBuildTime
     * @param newRT
     * @param newRessourceCostTwo
     * @param repairPossible
     * @param newRessourceCostOne
     * @param moveable
     * @param newDamageValueGround
     * @param valueToSell
     * @param targetGround
     * @param newDamageTypeGround
     * @param sellItPossible
     * @param newROF */
    public buildings(String newName, int newHP, int newBuildTime, int newRessourceCostOne, int newRessourceCostTwo, Boolean moveable, Boolean targetGround, int newDamageTypeGround, int newDamageValueGround, Boolean repairPossible, Boolean sellItPossible, int valueToSell, int newROF, int newRT){
    
        super(newName,newHP,newBuildTime,newRessourceCostOne,newRessourceCostTwo);
        this.canMove = moveable;
        this.canHitGround = targetGround;
        this.damageTypeGround = newDamageTypeGround;
        this.damageValueGround = newDamageValueGround;
        this.canBeRepaired = repairPossible;
        this.canBeSold = sellItPossible;
        this.valueSold = valueToSell;
        this.rateOfFire = newROF;
        this.reloadTime = newRT;
        
    }
    //air and ground 1 ressource 
    /** Constructor for a unit attacking air and ground and with a 1 ressource cost
     * @param newName
     * @param newHP
     * @param newBuildTime
     * @param newRessourceCostOne
     * @param newDamageValueAir
     * @param newDamageTypeAir
     * @param targetAir
     * @param moveable
     * @param newDamageTypeGround
     * @param newDamageValueGround
     * @param targetGround
     * @param newROF
     * @param newRT
     * @param repairPossible
     * @param valueToSell
     * @param sellItPossible */
    public buildings(String newName, int newHP, int newBuildTime, int newRessourceCostOne,Boolean moveable, Boolean targetGround, Boolean targetAir, int newDamageTypeGround, int newDamageTypeAir, int newDamageValueGround, int newDamageValueAir, Boolean repairPossible, Boolean sellItPossible, int valueToSell, int newROF, int newRT){
    
        super(newName,newHP,newBuildTime,newRessourceCostOne);
        this.canMove = moveable;
        this.canHitGround = targetGround;
        this.canHitAir = targetAir;
        this.damageTypeGround = newDamageTypeGround;
        this.damageTypeAir = newDamageTypeAir;
        this.damageValueGround = newDamageValueGround;
        this.damageValueAir = newDamageValueAir;
        this.canBeRepaired = repairPossible;
        this.canBeSold = sellItPossible;
        this.valueSold = valueToSell;
        this.rateOfFire = newROF;
        this.reloadTime = newRT;
        
    }
    //ground only 1 ressources
    /** Constructor for a unit attacking on ground only and with a 1 ressources cost
     * @param newName
     * @param newHP
     * @param newBuildTime
     * @param newRessourceCostOne
     * @param newROF
     * @param moveable
     * @param targetGround
     * @param newDamageTypeGround
     * @param sellItPossible
     * @param newDamageValueGround
     * @param repairPossible
     * @param valueToSell
     * @param newRT */
    public buildings(String newName, int newHP, int newBuildTime, int newRessourceCostOne, Boolean moveable, Boolean targetGround, int newDamageTypeGround, int newDamageValueGround, Boolean repairPossible, Boolean sellItPossible, int valueToSell, int newROF, int newRT){
    
        super(newName,newHP,newBuildTime,newRessourceCostOne);
        this.canMove = moveable;
        this.canHitGround = targetGround;
        this.damageTypeGround = newDamageTypeGround;
        this.damageValueGround = newDamageValueGround;
        this.canBeRepaired = repairPossible;
        this.canBeSold = sellItPossible;
        this.valueSold = valueToSell;
        this.rateOfFire = newROF;
        this.reloadTime = newRT;
        
    }
    // default constructor, air only with all default values
    /** Constructor with default values, air only
     * @param newName*/
    public buildings(String newName){
    
        super(newName);   
    }
    
    //methods || getters
    
    // metods || setters
}
