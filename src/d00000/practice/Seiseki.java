package d00000.practice;

public class Seiseki {
    public String name;
    public int presence;
    public int absence;
    public int score;

    public boolean isPassing() {
        int total = presence + absence;
        double rate = (double)presence / absence;
        if (rate < 0.8) {
            return false;
        }
        if (score < 60) {
            return false;
        }
        return true;
    }

}
