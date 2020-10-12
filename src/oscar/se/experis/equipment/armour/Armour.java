package oscar.se.experis.equipment.armour;

import oscar.se.experis.equipment.EquipmentSlot;

public abstract class Armour extends EquipmentSlot {

    private String armourName;
    private int armourLevel;
    private int armourBonusHealthPoints;
    private int armourBonusDexterity;
    private int armourBonusStrength;
    private int armourBonusIntelligence;

    //Getters and setters

    public String getArmourName() {
        return armourName;
    }

    public void setArmourName(String armourName) {
        this.armourName = armourName;
    }

    public int getArmourLevel() {
        return armourLevel;
    }

    public void setArmourLevel(int armourLevel) {
        this.armourLevel = armourLevel;
    }

    public int getArmourBonusHealthPoints() {
        return armourBonusHealthPoints;
    }

    public void setArmourBonusHealthPoints(int armourBonusHealthPoints) {
        this.armourBonusHealthPoints = armourBonusHealthPoints;
    }

    public int getArmourBonusDexterity() {
        return armourBonusDexterity;
    }

    public void setArmourBonusDexterity(int armourBonusDexterity) {
        this.armourBonusDexterity = armourBonusDexterity;
    }

    public int getArmourBonusStrength() {
        return armourBonusStrength;
    }

    public void setArmourBonusStrength(int armourBonusStrength) {
        this.armourBonusStrength = armourBonusStrength;
    }

    public int getArmourBonusIntelligence() {
        return armourBonusIntelligence;
    }

    public void setArmourBonusIntelligence(int armourBonusIntelligence) {
        this.armourBonusIntelligence = armourBonusIntelligence;
    }

    //Constructor

    public Armour(String armourName, int armourLevel, int armourBonusHealthPoints, int armourBonusDexterity, int armourBonusStrength, int armourBonusIntelligence, String slotType) {
        super(slotType);
        this.armourName = armourName;
        this.armourLevel = armourLevel;
        this.armourBonusHealthPoints = armourBonusHealthPoints;
        this.armourBonusDexterity = armourBonusDexterity;
        this.armourBonusStrength = armourBonusStrength;
        this.armourBonusIntelligence = armourBonusIntelligence;
    }
}
