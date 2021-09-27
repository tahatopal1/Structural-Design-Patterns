package Adapter;

public class Test {
    public static void main(String[] args) {
        Socket socket = new Socket();

        // No need to adapter
        Iron iron = new Iron();
        Refrigerator refrigerator = new Refrigerator();

        socket.startElectricity(iron);
        socket.startElectricity(refrigerator);

        SamsungPhone samsungPhone = new SamsungPhone();
        // socket.startElectricity(samsungPhone); -> Compile time error

        PhoneElectricalApplicanceAdapter applicanceAdapter = new PhoneElectricalApplicanceAdapter(samsungPhone);
        socket.startElectricity(applicanceAdapter);
    }
}
