package Adapter;

public class Socket {

    public void startElectricity(ElectricalHomeAppliance electricalHomeAppliance){
        int volt = electricalHomeAppliance.plugInAndStart();
        System.out.println(volt + " V comes from socket.");
    }

}
