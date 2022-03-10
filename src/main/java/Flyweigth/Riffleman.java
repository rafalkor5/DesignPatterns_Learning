package Flyweigth;

import Flyweigth.UnitStats.UnitStats;
import Flyweigth.UnitStats.UnitStatsRepo;

public class Riffleman extends Unit {
   private UnitStats stats ;

    protected Riffleman(int hp, int x, int y) {
        super(hp, x, y);
        stats = UnitStatsRepo.getRifflemanStats();
    }
}
