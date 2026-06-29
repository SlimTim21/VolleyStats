public class Player {
    String name;
    int kills;
    int hitAttempts;

    public Player (String playerName) {
        name = playerName;
        kills = 0;
        hitAttempts = 0;
    }

    public Player (String playerName, int playerKills, int playerHitAttempts) {
        name = playerName;
        kills = playerKills;
        hitAttempts = playerHitAttempts;
    }
}
