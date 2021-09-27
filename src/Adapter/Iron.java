package Adapter;

public class Iron implements ElectricalHomeAppliance{

    private int volt;

    public Iron(){
        this.volt = 220;
    }

    @Override
    public int plugInAndStart() {
        System.out.println("Iron has started");
        return volt;
    }
}
