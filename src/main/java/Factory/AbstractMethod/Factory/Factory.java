package Factory.AbstractMethod.Factory;

abstract public class  Factory {
        abstract public InfantryUnit createUnit(InfantaryUnitType unitType);
        abstract public MechanizedUnit createUnit(MechanizedUnitType unitType);
}
