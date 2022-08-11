package StrategyPattern.puzzle;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        this.weaponBehavior = w;
    }
}
