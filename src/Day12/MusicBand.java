package Day12;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> artists = new ArrayList<>();

    MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    int getYear() {
        return this.year;
    }

    String getName() {
        return this.name;
    }

    List<String> getArtists() {
        return artists;
    }

    void newArtists(String artists) {
        this.artists.add(artists);
    }

    void merger(MusicBand x) {
        for (int i = 0; i < x.getArtists().size(); i++) {
            artists.add(i, x.artists.get(i));

        }
        x.artists.clear();
    }
    void showInfo(){
        System.out.println("Группа " +getName()+ ", основанна в "+getYear()+ " году.");
        System.out.println("Актуальный состав участников: "+getArtists());
    }
}



