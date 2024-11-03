package StreetFootbal;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();

        Player.info();


        Player p7 = new Player();
        Player p8 = new Player();

        Player.info();


        while(p1.getStamina() > Player.MIN_STAMINA){
            p1.run();
        }

        System.out.println("Игрок 1 выдохся полностью и покинул поле");
        System.out.println("Текущее кол-во игроков на поле: " +Player.getCountPlayers());
    }

}
