package Flyweight;

public abstract class Military {

    private Caliber caliber;

    public Military(Caliber caliber) {
        this.caliber = caliber;
    }

    public void fire(){
        //Ammo ammo = new Ammo(caliber);
        Ammo ammo = AmmoFactory.produceAmmo(caliber);
        ammo.firingAmmo();
    }

    public void spray(){
        for (int i = 0; i < 5; i++)
            fire();
    }

}
