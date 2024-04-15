package opgave01.models.Weapon;

public class MeleeWeaponBehaviour implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("You swung your weapon");
    }
}
