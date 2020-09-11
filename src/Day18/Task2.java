package Day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(counter7(7577977));

    }

    public static int counter7(int x) {
        if (x < 7)
            return 0;
        if (x % 10 == 7)
            return counter7(x / 10) + 1;
        else return counter7(x / 10);

    }

}

