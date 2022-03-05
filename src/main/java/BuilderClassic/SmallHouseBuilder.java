package BuilderClassic;

public class SmallHouseBuilder implements HouseBuilder{

    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    //@Buildery
    @Override
    public void buildwalls() {
    this.house.setWalls("small");
    }
    @Override
    public void buildFloors() {
    this.house.setFloors("small");
    }
    @Override
    public void buildRooms() {
    this.house.setRooms("small");
    }
    @Override
    public void buildroof() {
    this.house.setRoof("small");
    }
    @Override
    public void buildwindwos() {
    this.house.setWindows("small");
    }
    @Override
    public void builddoors() {
    this.house.setDoors("small");
    }
    @Override
    public void buildgarage() {
    this.house.setGarage("small");
    }


    @Override
    public House getHouse() {
        return house;
    }
}
