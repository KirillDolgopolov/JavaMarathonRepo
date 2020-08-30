package Day7;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        Player.info();

        for (int i = 0; i < 99; i++) {
            player1.run();
        }
        Player.info();
    }
}


class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    static int counter;
    static int vacant;

    Player() {
        counter++;
        stamina = (int) (Math.random() * (MAX_STAMINA - 90 + 1)) + 90;
        if (counter > 6) {
            counter = 6;
        }
    }

    static void info() {
        vacant = 6 - counter;
        if (counter == 6) {
            System.out.println("Мест в командах больше нет.");
        } else {
            System.out.println("Команды неполные, ещё есть свободных мест: " + vacant);
        }
    }

    void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            System.out.println("Игрок устал, и покидает поле!");
            counter--;
        }
    }
}