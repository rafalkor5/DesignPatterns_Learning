package Adapter.Oneway.Adapters;

public class UKtoUE implements  UEDevice{

    UKDevice deive;

    public UKtoUE(UKDevice device){
        this.deive = device;
    }

    @Override
    public void powerOn() {
        deive.powerOn();
    }
}
