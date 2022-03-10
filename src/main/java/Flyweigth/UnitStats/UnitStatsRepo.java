package Flyweigth.UnitStats;

public class UnitStatsRepo {
    private static UnitStats RifflemanStats = new UnitStats(50,20,30,100);
    private static UnitStats ShipStats = new UnitStats(100,20,30,1000);
    private static UnitStats TankStats = new UnitStats(200,20,30,2000);

    private UnitStatsRepo (){}

    public static UnitStats getRifflemanStats() {
        return RifflemanStats;
    }

    public static UnitStats getShipStats() {
        return ShipStats;
    }

    public static UnitStats getTankStats() {
        return TankStats;
    }
}
