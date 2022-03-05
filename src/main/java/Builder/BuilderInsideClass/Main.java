package Builder.BuilderInsideClass;

public class Main {
    public static void main(String[] args) {
       // House house1 = new House("walls","floors","rooms","roof","windows","doors","garage");
        House house = new House.HouseBuilder()
                .builddoors("przyklad")
                .buildfloors("przyklad")
                .buildroof("przyklad")
                .buildgarage("przyklad")
                .buildrooms("przyklad")
                .build();
    }
}
