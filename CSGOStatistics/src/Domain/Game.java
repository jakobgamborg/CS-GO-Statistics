package Domain;

public class Game {
    private double kills;
    private double deaths;
    private double assists;
    private boolean win;
    private double kdRatio = 0;

    public double kdRatio() {
        kdRatio = kills/deaths;
        win = false;
    return kdRatio;
    }


    public double getAssists() {
        return assists;
    }

    public void setAssists(double assists) {
        this.assists = assists;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public double getKills() {
        return kills;
    }

    public void setKills(double kills) {
        this.kills = kills;
    }

    public double getDeaths() {
        return deaths;
    }

    public void setDeaths(double deaths) {
        this.deaths = deaths;
    }
}
