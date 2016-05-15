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
    //ground only 2 ressources
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

    
    //methods || getters
    
    // metods || setters
}
