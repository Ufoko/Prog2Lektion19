package opgave01;

import opgave01.models.Character.Character;
import opgave01.models.Character.King;
import opgave01.models.Character.Queen;
import opgave01.models.Weapon.Melee.SwordBehavior;
import opgave01.models.Weapon.Range.BowAndArrowBehavior;

public class Opgave01 {
    public static void main(String[] args) {

        Character theKing = new Character(new King());
        theKing.charClass.setWeapon(new SwordBehavior());
        theKing.charClass.fight();

        Character theQueen = new Character(new Queen());
        theQueen.charClass.setWeapon(new BowAndArrowBehavior());
        theQueen.charClass.fight();

    }
}
