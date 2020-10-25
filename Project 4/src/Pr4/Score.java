package Pr4;

public class Score {
    int score_milan;
    int score_madrid;
    String last = "DRAW";

    Score() {
        score_madrid = 0;
        score_milan = 0;
    }

    public void set_milan(int x) {
        score_milan = x;
    }

    public void set_madrid(int x) {
        score_madrid = x;
    }

    public void inc_madrid() {
        score_madrid++;
        last = "Madrid";
    }

    public void inc_milan() {
        score_milan++;
        last = "Milan";
    }

    public int get_milan() {
        return score_milan;
    }

    public int get_madrid() {
        return score_madrid;
    }

    public String get_winer() {
        if (score_milan > score_madrid) {
            return "Winner: Milan";
        }
        if (score_milan < score_madrid) {
            return "Winner: Madrid";
        } else {
            return "Winner: DRAW";
        }
    }

    public String get_last() {
        return "Last Scorer: " + last;
    }

    public String get_score() {
        return "Result: " + score_milan + " X " + score_madrid;
    }
}