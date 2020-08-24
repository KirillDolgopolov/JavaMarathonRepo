package Day1;
/*
Объявите переменную типа int, имя переменной - k.
Присвойте этой переменной какую-нибудь цифру от 1 до 9.
Используя цикл на ваше усмотрение (for или while),
выведите в консоль таблицу умножения для этой цифры в следующем формате:
1 x k = …
2 x k = …

 */

import java.util.Scanner;

public class Task6 {
    public static void main (String [] args) {
        int k;
        int s;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цифру, которую будем умножать");
        int input= in.nextInt();
        k=input;
        for (n=1; n<10; n++){
            s=k*n;
            System.out.println (n+" x " +k+ " = " +s);
        }







    }
}
