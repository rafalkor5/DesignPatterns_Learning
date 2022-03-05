package Builder.BuilderInsideClass;

public class House {
    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    //konstruktow prywatny dla klasy housebuilder
    //pobierający dane pól z housebilder
    private House(HouseBuilder houseBuilder) {
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;

    }
    //@Gettery
    //@ToString

    public static class HouseBuilder {
        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String windows;
        private String doors;
        private String garage;

        //@Buildery metody budujące "obiekt" zwracające obiekt
        // dzięki czemu mozemy wielokrotnie się odwoływać
        public HouseBuilder buildWalls(String walls){
            this.walls = walls;
            return this;
        }
        public HouseBuilder buildfloors(String floors){
            this.floors = floors;
            return this;
        }
        public HouseBuilder buildrooms(String rooms){
            this.rooms = rooms;
            return this;
        }
        public HouseBuilder buildroof(String roof){
            this.roof = roof;
            return this;
        }
        public HouseBuilder buildwindows(String windows){
            this.windows = windows;
            return this;
        }
        public HouseBuilder builddoors(String doors){
            this.doors = doors;
            return this;
        }
        public HouseBuilder buildgarage(String garage){
            this.garage = garage;
            return this;
        }
        //Metoda zakończająca proces budowy obiektu wywołuje
        //konstruktor prywatny i przekazuje do niego obiekt "HouseBuilder"
        public House build(){
            return new House(this);
        }

    }
}
