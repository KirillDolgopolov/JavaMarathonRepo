package Day1;

import java.util.Scanner;

public class Task5 {

    public static void main (String [] args){

        int age;
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите, сколько вам лет");
        int num = in.nextInt();
        age=num;

        for (; age<=100; age=age+5){
            System.out.println("Ваш возраст "+age);
        }



    }


}
