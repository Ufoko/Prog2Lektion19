package opgave01.models.Weapon;

public class RangedWeaponBehaviour implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("You shot your ranged weapon");
    }
}
