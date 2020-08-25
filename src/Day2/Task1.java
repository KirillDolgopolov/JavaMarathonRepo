package Day2;
/*
1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
число, соответствующее количеству этажей в здании.
Используя условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.

Условия: если этажей 1-4  - “Малоэтажный дом”, 5-8 -
“Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
Так же, необходимо учесть что может быть введено отрицательное значение.
В таком случае сообщить о некорректности ввода.

 */

import java.util.Scanner;

public class Task1 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество этажей дома");
        int numOfFloors = in.nextInt();
        if (numOfFloors<5 && numOfFloors>0){
            System.out.println("Это малоэтажный дом");
        } else if (numOfFloors>4 && numOfFloors<9){
            System.out.println("Это среднееэтажный дом");
        } else if (numOfFloors>8){
            System.out.println("Это многоэтажный дом");
        }
        else {
            System.out.println("Это землянка, а не дом. Ошибка ¯\\_(ツ)_/¯");
        }

    }

}
