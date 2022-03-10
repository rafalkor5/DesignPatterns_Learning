package Adapter.TwoWay.Adapters;

public class TwoWayAdapter implements UEDevice,UKDevice {

    UKDevice ukdevice;
    UEDevice uedevice;

    public TwoWayAdapter(UKDevice ukdevice, UEDevice uedevice){
        this.ukdevice = ukdevice;
        this.uedevice = uedevice;
    }

    public TwoWayAdapter(UKDevice ukdevice) {
        this.ukdevice = ukdevice;
    }

    public TwoWayAdapter(UEDevice uedevice) {
        this.uedevice = uedevice;
    }

    @Override
    public void UeOn() {
        ukdevice.UkOn();
    }

    @Override
    public void UkOn(){
        uedevice.UeOn();
    }
}
