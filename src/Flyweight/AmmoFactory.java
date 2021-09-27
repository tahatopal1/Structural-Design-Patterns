package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class AmmoFactory {
    private static Map<Caliber, Ammo> map = new HashMap<>();

    public static Ammo produceAmmo(Caliber caliber){

        Ammo ammo = map.get(caliber);

        if (ammo == null){
            ammo = new Ammo(caliber);
            map.put(caliber, ammo);
        }

        return ammo;

    }

}
