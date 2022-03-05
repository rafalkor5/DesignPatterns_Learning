package FactoryPackage.AbstractMethod;

import FactoryPackage.FabricMethod.Units.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new UnitFactory();

        //Nie uzywamy konstruktora tylko wywołujemy metode createUnit z UnitFactory.class
        //zaimplementowana z klasy abstrakcyjnej factory
        Unit tank = factory.createUnit(UnitType.Tank);
        Unit riffleman = factory.createUnit(UnitType.Riffleman);

        //Tak nie mozna chronione jest to przez paczke units. Klassa
        //Unit.class ma konstruktor protected(czyli tylko w obrebie klass rozszerzających)
        //Klasy jednostek mają widoczność domyślna czyli w obrębie pakietu dzięki czemu
        //UnitFactory.class może używać ich konstruktor.
        //Unit xd = new Riffleman(100,5,2);

    }
}
