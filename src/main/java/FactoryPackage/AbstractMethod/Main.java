package FactoryPackage.AbstractMethod;

import FactoryPackage.AbstractMethod.Factory.*;
import FactoryPackage.AbstractMethod.Factory.InfantaryUnitType;

public class Main {

    public static void main(String[] args) {
        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        Unit newUnit1 = blueFactory.createUnit(InfantaryUnitType.Riffleman);
        Unit newUnit2 = redFactory.createUnit(InfantaryUnitType.Riffleman);

        System.out.println("Siema tutaj " + newUnit1);
        System.out.println("Siema tutaj " + newUnit2);
        //Sniper sniper = new Sniper(50,0,5, Flag.RED);

    }
}
