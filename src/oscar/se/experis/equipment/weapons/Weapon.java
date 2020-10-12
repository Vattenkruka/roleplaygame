package oscar.se.experis.equipment.weapons;

import oscar.se.experis.equipment.EquipmentSlot;

public abstract class Weapon extends EquipmentSlot {
    private String weaponName;
    private int weaponLevel;
    private int weaponDamage;


    // Constructor for weapon
    public Weapon(int weaponLevel, int weaponDamage, String slotType) {
        super(slotType);
        this.weaponName = "";
        this.weaponLevel = weaponLevel;
        this.weaponDamage = weaponDamage;
    }


    // Getters and setters
    public int getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(int weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;

    }
}
