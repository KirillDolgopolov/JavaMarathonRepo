package Day2;

import java.util.Scanner;

public class Task4 {
    public static void main (String[] args){
                Scanner in = new Scanner(System.in);
        System.out.println ("Введите число х");
        double x = in.nextDouble();
        double y;
        if (x>=5){
            y=(Math.pow(x,2)-10)/(x+7);
            System.out.println ("Y = "+y);
        }else if (x>-3 && x<5){
            y=(x+3)*(Math.pow(x,2)-2);
            System.out.println ("Y = "+y);
        } else
            System.out.println ("Y = 420");
    }
}
