package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа через пробел.\n" +
                "Мы выведем все числа, что делятся на 5 без остатка, а на 10 - нет");

        int a= in.nextInt();
        int b= in.nextInt();

        if (a>b){
            int temp = b;
            b = a;
            a = temp;
        }

        while (a<=b){


            if (a%5==0 && a%10!=0){
                System.out.print(a+" ");
            }
            a++;
        }
        }
    }
