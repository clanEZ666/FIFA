package StreetFootbal;



import java.util.ArrayList;
import java.util.List;

class Game {
    private List<Player> players;
    private static final int MAX_PLAYERS_ON_FIELD = 6;


    public Game() {
        this.players = new ArrayList<>();
    }


    public boolean addPlayer(String playerName) {
        if (players.size() >= MAX_PLAYERS_ON_FIELD) {
            System.out.println("Достигнуто максимальное количество игроков на поле: " + MAX_PLAYERS_ON_FIELD);
            return false;
        }
        if (playerName == null || playerName.isBlank()) {
            System.out.println("Имя игрока не может быть пустым.");
            return false;
        }
        Player newPlayer = new Player(playerName);
        players.add(newPlayer);
        System.out.println("Игрок добавлен: " + playerName);
        return true;
    }


    public void displayPlayers() {
        if (players.isEmpty()) {
            System.out.println("Список игроков пуст.");
            return;
        }
        System.out.println("Текущие игроки:");
        for (Player player : players) {
            System.out.println("- " + player.getName());
        }
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void removeExhaustedPlayers() {
        players.removeIf(Player::isExhausted);
        System.out.println("Выдохшиеся игроки удалены.");
    }


}