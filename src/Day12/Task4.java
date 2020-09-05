package Day12;
/* Доработать класс MusicBand из прошлого задания таким образом,
чтобы в группу можно было добавлять и удалять участников.
Под участником понимается строка (String) с именем и фамилией.
Реализовать метод слияния групп, т.е.
все участники группы А переходят в группу B
(участники не могут находиться в двух группах одновременно).
Реализовать метод, выводящий список участников в консоль.
Проверить состав групп после слияния.
*/

public class Task4 {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("Клей", 2006);
        MusicBand band2 = new MusicBand("Бескрайняя плоть", 2001);

        band1.newArtists("Петя Шишкин");
        band1.newArtists("Вася Папироскин");
        band1.newArtists("Джон Леннон");
        band1.newArtists("Хосе Игнасио");

        band2.newArtists("Света Курочкина");
        band2.newArtists("Гриша Тапкин");
        band2.newArtists("Николай Хвостов");

        band1.showInfo();
        band2.showInfo();
        System.out.println();
        System.out.println();
        System.out.println();
        band1.merger(band2);

        band1.showInfo();
        System.out.println();
        band2.showInfo();

    }
}
