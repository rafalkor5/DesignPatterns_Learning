package Flyweigth;

import Flyweigth.UnitStats.UnitStats;
import Flyweigth.UnitStats.UnitStatsRepo;

public class Tank extends Unit{
    private UnitStats stats ;
    protected Tank(int hp, int x, int y) {
        super(hp, x, y);
        stats = UnitStatsRepo.getTankStats();
    }
}
