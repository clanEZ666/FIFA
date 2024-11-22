package StreetFootbal;

import java.util.List;
import java.util.Random;

public class Player {
    private String name;
    private int stamina;
    private boolean Exhausted;


    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    private static int countPlayers = 0;

    private static final int MAX_PLAYERS_ON_FIELD = 6;


    public int getStamina() {
        return stamina;
    }

    public Player() {
        Random rand = new Random();
        this.stamina = 90 + rand.nextInt(11);

        if (countPlayers < MAX_PLAYERS_ON_FIELD) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;

            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }

        }

    }

    public static void info() {
        if (countPlayers < MAX_PLAYERS_ON_FIELD) {
            int freeSpots = MAX_STAMINA - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + freeSpots + " свободных мест.");
        } else {
            System.out.println("На поле нету свободных мест");
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    } 

    public Player(String name) {
        this.name = name;
    }

    public void setExhausted(boolean exhausted) {
        Exhausted = exhausted;
    }

    public boolean isExhausted() {
        return Exhausted;
    }

    public Player(String name, boolean exhausted) {
        this.name = name;
        this.Exhausted = exhausted;
    }

    @Override
    public String toString() {
        return "Player name= " + name + "выдохся" + Exhausted;
    }


    public static void removeiShaustedPlayers(List<Player> players) {
        players.removeIf(Player::isExhausted);
    }

}



