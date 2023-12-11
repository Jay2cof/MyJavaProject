package OOP.Abstraction;

public class Sports {
    private String winners;
    private String losers;
    private int scores;

    public String getDangerous() {
        return Dangerous;
    }

    public void setDangerous(String dangerous) {
        Dangerous = dangerous;
    }

    private String Dangerous;
    //private int score;

    public Sports(String winners, String losers, int scores) {
        this.winners = winners;
        this.losers = losers;
        this.scores = scores;
        //this.score = score;
    }

    public String getWinners() {
        return winners;
    }

    public void setWinners(String winners) {
        this.winners = winners;
    }

    public String getLosers() {
        return losers;
    }

    public void setLosers(String losers) {
        this.losers = losers;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }
}
