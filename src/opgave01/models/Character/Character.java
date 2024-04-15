package opgave01.models.Character;

import opgave01.models.Weapon.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;
    public void fight() {
        weapon.useWeapon();
    }

}
