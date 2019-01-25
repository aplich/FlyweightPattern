package flyweight;

public class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats("Destroyer", 800, 300, 30, 10, 5000);
    private static UnitStats teslaTankUnitStats = new UnitStats("Tesla Tank", 400, 100, 30, 10, 500);
    private static UnitStats riflemanUnitStats = new UnitStats("Rifleman", 100, 500, 30, 10, 50);
    private UnitStatsRepository() {
    }

    public static UnitStats getDestroyerStats() {
        return destroyerStats;
    }

    public static UnitStats getTeslaTankStats() {
        return teslaTankUnitStats;
    }

    public static UnitStats getRiflemanUnitStats() {
        return riflemanUnitStats;
    }

}
