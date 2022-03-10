package Adapter.Oneway;

import Adapter.Oneway.Adapters.*;

public class Main {
    public static void main(String[] args) {

        UEDevice radio = () -> System.out.println("SIEMA GRA UE");
        UESocekt gniazdkoUE = new UESocekt();
        gniazdkoUE.plugIn(radio);


        UKDevice radiozangli = () -> System.out.println("Gra po angielsku");
        UKSocekt ganiazdkoUK = new UKSocekt();
        ganiazdkoUK.plugIn(radiozangli);


        UKtoUE adapter = new UKtoUE(radiozangli);
        gniazdkoUE.plugIn(adapter);

}}
