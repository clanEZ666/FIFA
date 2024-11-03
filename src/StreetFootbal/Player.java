package StreetFootbal;

import java.util.Random;

public class Player {

    private int stamina;

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

        if(countPlayers < MAX_PLAYERS_ON_FIELD) {
            countPlayers++;
        }
    }
      //Метод изменения выносливоости на -1 при вызове
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


}



