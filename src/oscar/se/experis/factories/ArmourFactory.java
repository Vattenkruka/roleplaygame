package oscar.se.experis.factories;

import oscar.se.experis.equipment.armour.*;

public class ArmourFactory {

    public Armour getArmour(ArmourTypes type) {
        return switch (type) {
            case Cloth -> new Cloth();
            case Leather -> new Leather();
            case Plate -> new Plate();
            default -> null;
        };
    }
}
