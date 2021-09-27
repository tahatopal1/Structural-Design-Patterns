package Adapter;

public class PhoneElectricalApplicanceAdapter implements ElectricalHomeAppliance{

    private Phone phone;

    public PhoneElectricalApplicanceAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int plugInAndStart() {
        return phone.charge();
    }
}
