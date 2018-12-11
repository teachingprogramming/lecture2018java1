package d00000.exam;

public class MatchReport {
    public int sumOfGoalFor;
    public int sumOfGoalAgainst;
    public int win;
    public int draw;
    public int lose;

    public MatchReport() {
        sumOfGoalFor = 0;
        sumOfGoalAgainst = 0;
        win = 0;
        lose = 0;
        draw = 0;
    }

    public void record(int goalFor, int goalAgainst) {
        sumOfGoalFor += goalFor;
        sumOfGoalAgainst += goalAgainst;
        if (goalFor > goalAgainst) {
            win++;
        } else if (goalFor == goalAgainst) {
            draw++;
        } else {
            lose++;
        }
    }

    public int getPoints() {
        return win * 3 + draw;
    }

    public int getGames() {
        return win + draw + lose;
    }

    public int getGoalDifference() {
        return sumOfGoalFor - sumOfGoalAgainst;
    }

}
