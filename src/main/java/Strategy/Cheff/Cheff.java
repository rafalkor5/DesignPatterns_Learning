package Strategy.Cheff;

public class Cheff {

    private String name;

    public Cheff(String name) {
        this.name = name;
    }

    public void cook(EggCooker eggCooker){
        System.out.print(name + " ");
        eggCooker.cookEgg();
    }
}



