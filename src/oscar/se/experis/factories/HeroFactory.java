package oscar.se.experis.factories;

import oscar.se.experis.heroes.*;

public class HeroFactory {
    public Hero getHero (HeroTypes type) {
        return switch (type) {
            case Mage -> new Mage();
            case Ranger -> new Ranger();
            case Warrior -> new Warrior();
            default -> null;
        };
    }
}
