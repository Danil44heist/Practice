package homework3;

public class GameSettings {
    private static int maxPlayers;
    private final String gameName;
    private int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers) {
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    int addPlayer() {
        return ++this.currentPlayers;
    }

     final void printGameStatus(){
        System.out.println("Навазние " + this.gameName + ", текущее количество игроков: " + this.currentPlayers + ", максимальное количество игроков: " + maxPlayers);
    }



}
