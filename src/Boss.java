public class Boss extends GameEntity {
    private Weapon bossWeapon ;
    public Boss(){

    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }
    public String printInfo(){
        return "Name: "+getName()+" Healhs "+getHeals()+" Damage: "+getDamage();

    }
}
