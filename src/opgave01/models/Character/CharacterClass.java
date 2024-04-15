package opgave01.models.Character;

import opgave01.models.Weapon.WeaponBehavior;

public abstract class CharacterClass {
    protected WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }



}
