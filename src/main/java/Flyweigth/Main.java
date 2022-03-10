package Flyweigth;

import Flyweigth.UnitStats.UnitStatsRepo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            activeUnits.add(new Tank(50,50,50));
            activeUnits.add(new Riffleman(50,50,50));
            activeUnits.add(new Ship(50,50,50));
        }

    }
}
