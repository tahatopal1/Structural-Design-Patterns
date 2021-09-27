package Flyweight;

public class Ammo {

    private Caliber caliber;

    public Ammo(Caliber caliber) {
        this.caliber = caliber;
        System.out.println(caliber.getSize() + "mm ammo is created.");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void firingAmmo(){
        System.out.println("Bang!");
    }

}
