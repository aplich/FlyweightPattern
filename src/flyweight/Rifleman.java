package flyweight;

public class Rifleman {

    private UnitStats stats;
    private int x;
    private int y;
    private int hpLeft;


    public Rifleman(int x, int y) {
        this.stats = UnitStatsRepository.getRiflemanUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();

    }
}
