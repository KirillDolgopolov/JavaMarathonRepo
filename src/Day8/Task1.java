package Day8;

/*
Создать строку, состоящую из чисел от 0 до 20000.
Важно понимать, что это одна строка,
полученная конкатенацией (“склеиванием”)
чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке
должен вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

Для того, чтобы почувствовать разницу в производительности
между конкатенацией обычных строк (класс String)
и использовании StringBuilder,
реализуйте описанную задачу этими двумя способами,
замеряя время работы программы.
 */
public class Task1 {
    public static void main(String[] args) {

        long c1, c2, c3, c4, c1f, c2f;
        String finalLine = "";

        c1 = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            finalLine += " " + i;
        }
        System.out.println(finalLine);
        c2 = System.nanoTime();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        c3 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(" ").append(i);
        }
        System.out.println(sb);
        c4 = System.nanoTime();
        c1f = c2 - c1;
        c2f = c4 - c3;
        System.out.println("Выполнение конкатениации с созданием новых строк занимает наносекунд: " + c1f);
        System.out.println("изменение строки с помощью String Builder занимает наносекунд: " + c2f);
        System.out.printf("Разница в скорости выполнения в %d раз", (c1f/c2f));

    }

}
