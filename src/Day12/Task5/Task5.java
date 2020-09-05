package Day12.Task5;

/*Требования поменялись - теперь у участника музыкальной группы
есть не только имя, но и возраст. Соответственно, теперь под участником
понимается не строка, а объект класса MusicArtist.
Необходимо реализовать класс MusicArtist и доработать класс MusicBand
(создать копию класса, с новым именем) таким образом, чтобы участники были -
объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось в 4 задании -
слить две группы и проверить состав групп после слияния.
Методы для слияния и для вывода участников в консоль необходимо тоже переработать,
чтобы они работали с объектами класса MusicArtist.
*/

import Day12.MusicBand;

public class Task5 {
    public static void main(String[] args) {

        MusicBand2 band1 = new MusicBand2("Клей", 2006);
        MusicBand2 band2 = new MusicBand2("Бескрайняя плоть", 2001);

        MusicArtist art1 = new MusicArtist("Петя Шишкин", 1988);
        MusicArtist art2 = new MusicArtist("Вася Папироскин", 1999);
        MusicArtist art3 = new MusicArtist("Джон Леннон", 1947);
        MusicArtist art4 = new MusicArtist("Хосе Игнасио", 1977);
        MusicArtist art5 = new MusicArtist("Света Курочкина", 2001);
        MusicArtist art6 = new MusicArtist("Гриша Тапкин", 1984);
        MusicArtist art7 = new MusicArtist("Николай Хвостов", 1987);

        band1.newArtists(art1);
        band1.newArtists(art2);
        band1.newArtists(art3);
        band1.newArtists(art4);
        band2.newArtists(art5);
        band2.newArtists(art6);
        band2.newArtists(art7);

        band1.showInfo();
        System.out.println();
        band2.showInfo();
        System.out.println();

        band1.merger(band2);

        band1.showInfo();
        band2.showInfo();
    }
}
