package BuilderClassic;

public class BigHouseBuilder implements  HouseBuilder{

    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    //@Buildery
    @Override
    public void buildwalls() {
        this.house.setWalls("BIG");
    }
    @Override
    public void buildFloors() {
        this.house.setFloors("BIG");
    }
    @Override
    public void buildRooms() {
        this.house.setRooms("BIG");
    }
    @Override
    public void buildroof() {
        this.house.setRoof("BIG");
    }
    @Override
    public void buildwindwos() {
        this.house.setWindows("BIG");
    }
    @Override
    public void builddoors() {
        this.house.setDoors("BIG");
    }
    @Override
    public void buildgarage() {
        this.house.setGarage("BIG");
    }


    @Override
    public House getHouse() {
        return house;
    }
}

