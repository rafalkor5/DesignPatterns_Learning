package Flyweigth;

import Flyweigth.UnitStats.UnitStats;
import Flyweigth.UnitStats.UnitStatsRepo;

public class Ship extends Unit{
    private UnitStats stats ;
    protected Ship(int hp, int x, int y) {
        super(hp, x, y);
        stats = UnitStatsRepo.getShipStats();
    }
}
