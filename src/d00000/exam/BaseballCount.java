package d00000.exam;

public class BaseballCount {
    public int ballCount;
    public int strikeCount;
    public int outCount;

    public void hit() {
        ballCount = 0;
        strikeCount = 0;
    }

    public void out() {
        ballCount = 0;
        strikeCount = 0;
        outCount++;
    }

    public boolean ball() {
        ballCount++;
        if (ballCount == 4) {
            ballCount = 0;
            strikeCount = 0;
            return true;
        } else {
            return false;
        }
    }

    public boolean strike() {
        strikeCount++;
        if (strikeCount == 3) {
            ballCount = 0;
            strikeCount = 0;
            outCount++;
            return true;
        } else {
            return false;
        }
    }
}
