package oscar.se.experis.heroes;

import oscar.se.experis.equipment.EquipmentSlot;
import oscar.se.experis.equipment.EquipmentSlotType;
import oscar.se.experis.equipment.WeaponSlot;
import oscar.se.experis.equipment.armour.Armour;
import oscar.se.experis.equipment.weapons.Weapon;
import oscar.se.experis.heroes.attack.IAttack;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Hero {
    private int experiencePoints;
    private int level;
    private String heroName;
    private int healthPoints;
    private int strength;
    private int dexterity;
    private int intelligence;

    int currentExp = 0;
    int maxExpPerLevel = 100;
    int restExp = 0;

    //Hashmaps
    private HashMap<EquipmentSlot, Armour> armourHashMap;
    private HashMap<EquipmentSlot, Weapon> weaponHashMap;


    public IAttack getAttackMethod() {


        return attackMethod;
    }

    //Getters and Setters

    public HashMap<EquipmentSlot, Armour> getArmourHashMap() {
        return armourHashMap;
    }

    public void setArmourHashMap(HashMap<EquipmentSlot, Armour> armourHashMap) {
        this.armourHashMap = armourHashMap;
    }

    public HashMap<EquipmentSlot, Weapon> getWeaponHashMap() {
        return weaponHashMap;
    }

    public void setWeaponHashMap(HashMap<EquipmentSlot, Weapon> weaponHashMap) {
        this.weaponHashMap = weaponHashMap;
    }

    public void setAttackMethod(IAttack attackMethod) {
        this.attackMethod = attackMethod;
    }

    private IAttack attackMethod;

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Constructor for Hero

    public Hero(int experiencePoints, int level, String heroName, int healthPoints, int strength, int dexterity, int intelligence) {
        this.experiencePoints = experiencePoints;
        this.level = level;
        this.heroName = heroName;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    //Methods or functions related to hero. Such as level-up and equip armour or weapons.

    public void attack() {
        attackMethod.dealDamage();
    }

    public void levelUp() {
        level++;
    }

    public void addHeroExperience(Hero hero, int amountOfExp) {
        currentExp +=amountOfExp;
        restExp = 0;
        if (currentExp >= maxExpPerLevel) {
            level++;
            restExp = currentExp-maxExpPerLevel;
            maxExpPerLevel = (int) (maxExpPerLevel * 1.1);
            currentExp = 0+restExp;
            System.out.println(hero.getHeroName() + " has leveled up! The hero is now level " + hero.getLevel());
        }
    }

    public void printHeroDetails(Hero hero) {

        System.out.println("Details: " + hero.getHeroName());
        System.out.println("HP: " + hero.getHealthPoints());
        System.out.println("Str: " + hero.getStrength());
        System.out.println("Dex: " + hero.getDexterity());
        System.out.println("Int: " + hero.getIntelligence());
        System.out.println("Lvl: " + hero.getLevel());
        System.out.println("Exp to next: " + (maxExpPerLevel-currentExp));
    }

}

