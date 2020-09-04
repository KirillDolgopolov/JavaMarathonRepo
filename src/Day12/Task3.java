package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand band1 = new MusicBand("Виталлика", 1981);
        MusicBand band2 = new MusicBand("Мошер-Дебошер", 1981);
        MusicBand band3 = new MusicBand("Красный кабальеро", 1999);
        MusicBand band4 = new MusicBand("Сизый хрен", 1935);
        MusicBand band5 = new MusicBand("Ленинский угар", 1998);
        MusicBand band6 = new MusicBand("Шведский танцор", 2004);
        MusicBand band7 = new MusicBand("Ангелика и Ко", 2001);
        MusicBand band8 = new MusicBand("Петровы в гриппе", 2019);
        MusicBand band9 = new MusicBand("Доктор Кто", 2020);
        MusicBand band10 = new MusicBand("Ленное Леново", 2017);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        Collections.shuffle(bands);

        List<MusicBand> newList = new ArrayList<>();

        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                newList.add(bands.get(i));
            }

        }
        for (MusicBand band : bands) {
            System.out.println(band.getName() + " " + band.getYear());
        }
        System.out.println();

        for (MusicBand band : newList) {
            System.out.println(band.getName() + " " + band.getYear());
        }

    }
}
