package Adapter;

import Adapter.ElectricalHomeAppliance;

public class Refrigerator implements ElectricalHomeAppliance {

    private int volt;

    public Refrigerator(){
        this.volt = 220;
    }

    @Override
    public int plugInAndStart() {
        System.out.println("Iron has started");
        return volt;
    }
}
