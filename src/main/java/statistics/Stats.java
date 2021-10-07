package statistics;

public interface Stats {
    public Stat getStat(String name);
    public StatGhost getPublicStat(String name);
}
