package oscar.se.experis;

import oscar.se.experis.equipment.EquipmentSlotType;
import oscar.se.experis.equipment.HeadSlot;
import oscar.se.experis.equipment.armour.Armour;
import oscar.se.experis.equipment.armour.ArmourTypes;
import oscar.se.experis.equipment.weapons.Weapon;
import oscar.se.experis.equipment.weapons.WeaponTypes;
import oscar.se.experis.factories.ArmourFactory;
import oscar.se.experis.factories.HeroFactory;
import oscar.se.experis.factories.WeaponFactory;
import oscar.se.experis.heroes.*;

public class Main {

    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        ArmourFactory armourFactory = new ArmourFactory();
        WeaponFactory weaponFactory = new WeaponFactory();

        // Created these string to ensure no syntax errors due to misspelling while assigning slotType for a piece of equipment
        String headSlot = "Head";
        String bodySlot = "Body";
        String legsSlot = "Legs";

        //Creating some heroes to test
        Hero sean = heroFactory.getHero(HeroTypes.Mage);
        sean.setHeroName("Sean the Code-Sage");
        Hero aman = heroFactory.getHero(HeroTypes.Warrior);
        aman.setHeroName("Aman the Codebreaker");
        Hero oscar = heroFactory.getHero(HeroTypes.Ranger);
        oscar.setHeroName("Oscar the Codeshot");

        //Creating some weapons to test
        Weapon axeOfAman = weaponFactory.getWeapon(WeaponTypes.MeleeWeapon);
        axeOfAman.setWeaponName("Axe of Aman");
        Weapon bowOfOscar = weaponFactory.getWeapon(WeaponTypes.RangedWeapon);
        bowOfOscar.setWeaponName("Bow of Oscar");

        //Creating some armour to test
        //Creating an armourset out of plate
        Armour mithrilHelmet = armourFactory.getArmour(ArmourTypes.Plate);
        mithrilHelmet.setArmourName("Mithril Helmet");
        mithrilHelmet.setSlotType(headSlot);
        Armour mithrilChestpiece = armourFactory.getArmour(ArmourTypes.Plate);
        mithrilChestpiece.setArmourName("Mithril Chestpiece");
        mithrilChestpiece.setSlotType(bodySlot);
        Armour mithrilLegplates = armourFactory.getArmour(ArmourTypes.Plate);
        mithrilLegplates.setArmourName("Mithril Legplates");
        mithrilLegplates.setSlotType(legsSlot);

        //Creating an armourset out of leather
        Armour hideHeadGear = armourFactory.getArmour(ArmourTypes.Leather);
        hideHeadGear.setArmourName("Hide Headgear");
        hideHeadGear.setSlotType(headSlot);
        Armour leatherChestpiece = armourFactory.getArmour(ArmourTypes.Leather);
        leatherChestpiece.setArmourName("Leather Chestpiece");
        leatherChestpiece.setArmourName(bodySlot);
        Armour leatherPants = armourFactory.getArmour(ArmourTypes.Leather);
        leatherPants.setArmourName("Leather Pants");
        leatherPants.setSlotType(legsSlot);

        //Creating an armourset out of cloth
        Armour silkCowl = armourFactory.getArmour(ArmourTypes.Cloth);
        silkCowl.setArmourName("Silk Cowl");
        silkCowl.setSlotType(headSlot);
        Armour silkRobe = armourFactory.getArmour(ArmourTypes.Cloth);
        silkRobe.setArmourName("Silk Robe");
        silkRobe.setSlotType(bodySlot);
        Armour linnenPants = armourFactory.getArmour(ArmourTypes.Cloth);
        linnenPants.setArmourName("Linnen Pants");
        linnenPants.setSlotType(legsSlot);


        //Adds experience and potentially levels up a hero
        aman.printHeroDetails(aman);
        aman.addHeroExperience(aman, 120);
        aman.printHeroDetails(aman);
        aman.addHeroExperience(aman, 110);
        aman.printHeroDetails(aman);
    }


    }


