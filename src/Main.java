public class Main {
    public static void main(String[] args) {
        Boss bossParameters=new Boss();
        bossParameters.setName("Kirito");
        bossParameters.setHeals(1000000);
        bossParameters.setDamage(10000);
        Weapon bossWeapon =new Weapon();
        bossWeapon.setType(WeaponType.SWORD);
        bossWeapon.setNameWeapon(" Eryushidēta ");
        System.out.println("Name: "+ bossParameters.getName()+" Heals: "+bossParameters.getHeals()+
                " Damage: "+bossParameters.getDamage()+" Weapon: "+bossWeapon.getType()+
                " "+bossWeapon.getNameWeapon());
        System.out.println(bossParameters.printInfo());
        Skeleton parameters= new Skeleton();
        parameters.setName("Sk1");
        parameters.setHeals(1500);
        parameters.setDamage(150);
        parameters.setArrow(20);
        Skeleton parameters2=new Skeleton();
        parameters2.setName("Sk2");
        parameters2.setHeals(1500);
        parameters2.setDamage(150);
        parameters2.setArrow(25);
        System.out.println(parameters.printInfo()+" "+parameters2.printInfo());


    }
}