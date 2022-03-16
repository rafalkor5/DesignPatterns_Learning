package Strategy;

import Strategy.Cheff.Cheff;
import Strategy.Cheff.EggCooker;
import Strategy.Cheff.HardBBoiledEggCooker;

public class Main {
    public static void main(String[] args) {
        Cheff cheff = new Cheff("Małcin");
        cheff.cook(new HardBBoiledEggCooker());
    }
}
