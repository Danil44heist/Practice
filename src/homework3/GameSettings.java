package homework3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers) {
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    int addPlayer() {
        return this.currentPlayers++;
    }

    void printGameStatus(){
        System.out.println("Навазние " + this.gameName + ", текущее количество игроков: " + this.currentPlayers + ", максимальное количество игроков: " + maxPlayers);
    }



}
