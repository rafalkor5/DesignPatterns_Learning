package FactoryPackage.AbstractMethod.Factory;

public class RedFactory extends Factory{
    private Flag flag = Flag.RED;
    @Override
    public InfantryUnit createUnit(InfantaryUnitType unitType) {
        switch (unitType){
            case Sniper:
                return new Sniper(100,0,100,flag);
            case Riffleman:
                return new Riffleman(100,0,10,flag);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    @Override
    public MechanizedUnit createUnit(MechanizedUnitType unitType) {
        switch (unitType){
            case TANK:
                return new Tank(200,0,20,flag);
            case Car:
                return new Car(150,0,20,flag);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}