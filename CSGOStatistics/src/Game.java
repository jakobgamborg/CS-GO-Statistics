public class Game {
    int kills;
    int deaths;
    int assist;

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public Game (int kills, int deaths, int assist){
        this.kills = kills;
        this.deaths = deaths;
        this.assist = assist;
    }
    public void toString (Game game){
        System.out.println("Kills = "+ game.getKills() +" Deaths = " + game.getDeaths() + " Assist = " + game.getAssist());

    }

}
