package Factory.FabricMethod.Units;

public class UnitFactory extends Factory{

    @Override
    public Unit createUnit(UnitType unitType) {

        switch (unitType){
            case Tank:
                return new Tank(200,0,20);
            case Riffleman:
                return new Riffleman(100,0,10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
