package BuilderClassic;

public class HouseDirector {
    //housedirector przechowuje buildera
    private HouseBuilder houseBuilder;

    //podczas tworzenia dyrektora przekazujemy buildera
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //wywołujemy metody zaimplementowane z interfejsu
    public void buildHouse(){
        houseBuilder.buildwalls();
        houseBuilder.buildFloors();
        houseBuilder.buildgarage();
        houseBuilder.buildRooms();
        houseBuilder.buildroof();
        houseBuilder.builddoors();
        houseBuilder.buildwindwos();
    }

    //metoda zwracająca zbudowany obiekt z housebuildera
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
