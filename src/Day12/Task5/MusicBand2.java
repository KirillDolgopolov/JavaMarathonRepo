package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand2 {
    private String name;
    private int year;
    private List<MusicArtist> artists = new ArrayList<>();

    MusicBand2(String name, int year) {
        this.name = name;
        this.year = year;
    }

    int getYear() {
        return this.year;
    }

    String getName() {
        return this.name;
    }

    List<MusicArtist> getArtists() {
        return artists;
    }

    void newArtists(MusicArtist artists) {
        this.artists.add(artists);
    }

    void merger(MusicBand2 x) {
        for (int i = 0; i < x.getArtists().size(); i++) {
            artists.add(i, x.artists.get(i));

        }
        x.artists.clear();
    }

    void showInfo() {
        System.out.println("Группа " + getName() + ", основанна в " + getYear() + " году.");
        System.out.println("Актуальный состав участников: ");
        for (int i = 0; i < artists.size(); i++) {
            System.out.println(artists.get(i).hello());
        }
    }
}



