package Builder.BuilderClassic;

public class Main {
    public static void main(String[] args) {
    SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
    //Tworzymy instacje buildera
    HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
    //Tworzymy dyrektora
    smallHouseDirector.buildHouse();
    //Polecenie budowy obiektu
    BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();
    HouseDirector BigHouseDirector = new HouseDirector(bigHouseBuilder);
    BigHouseDirector.buildHouse();
    //pobieramy zbudowany obiekt do naszego obiektu w main
    House smallHouse = smallHouseDirector.getHouse();
    House bigHouse = BigHouseDirector.getHouse();
    //Wyświetlamy obiekty
    System.out.println(smallHouse);
    System.out.println(bigHouse);

    }
}
