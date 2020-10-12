package oscar.se.experis.factories;

import oscar.se.experis.equipment.weapons.MeleeWeapon;
import oscar.se.experis.equipment.weapons.RangedWeapon;
import oscar.se.experis.equipment.weapons.Weapon;
import oscar.se.experis.equipment.weapons.WeaponTypes;

public class WeaponFactory {

    public Weapon getWeapon(WeaponTypes type){
        return switch (type){
            case MeleeWeapon -> new MeleeWeapon();
            case RangedWeapon -> new RangedWeapon();
            default -> null;
        };
    }
}
