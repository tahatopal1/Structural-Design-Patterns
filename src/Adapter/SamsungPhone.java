package Adapter;

public class SamsungPhone implements Phone{

    private int runningVolt;

    public SamsungPhone(){
        runningVolt = 5;
    }

    @Override
    public int charge() {
        System.out.println("Samsung Phone is working.");
        return runningVolt;
    }
}
