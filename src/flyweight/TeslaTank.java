package flyweight;

public class TeslaTank {

    private UnitStats stats;
    private int x;
    private int y;
    private int hpLeft;


    public TeslaTank(int x, int y) {
       this.stats = UnitStatsRepository.getTeslaTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();

    }
}
