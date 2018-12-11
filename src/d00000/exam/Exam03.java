package d00000.exam;

public class Exam03 {
    public static void main(String[] args) {
        MatchReport mr1 = new MatchReport();
        mr1.record(0, 0);
        mr1.record(4, 2);
        mr1.record(3, 1);
        mr1.record(1, 1);
        mr1.record(0, 1);
        mr1.record(0, 0);
        mr1.record(0, 1);
        mr1.record(1, 2);
        mr1.record(0, 1);
        mr1.record(3, 1);
        mr1.record(2, 1);
        mr1.record(0, 2);
        mr1.record(1, 3);
        mr1.record(4, 2);
        mr1.record(0, 3);
        mr1.record(3, 0);
        mr1.record(2, 1);
        mr1.record(1, 0);
        mr1.record(0, 1);
        mr1.record(1, 2);
        mr1.record(1, 3);
        mr1.record(3, 3);
        mr1.record(1, 2);
        mr1.record(2, 1);
        mr1.record(1, 2);
        mr1.record(3, 2);
        mr1.record(1, 2);
        mr1.record(2, 0);
        mr1.record(5, 1);
        mr1.record(2, 0);
        mr1.record(0, 0);
        mr1.record(2, 0);
        mr1.record(3, 3);
        mr1.record(4, 4);
        System.out.println("勝点: " + mr1.getPoints());
        System.out.println("試合数: " + mr1.getGames());
        System.out.println("勝数: " + mr1.win);
        System.out.println("引分数: " + mr1.draw);
        System.out.println("敗数: " + mr1.lose);
        System.out.println("得点: " + mr1.sumOfGoalFor);
        System.out.println("失点: " + mr1.sumOfGoalAgainst);
        System.out.println("得失点差: " + mr1.getGoalDifference());
    }
}
