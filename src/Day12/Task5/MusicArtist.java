package Day12.Task5;

public class MusicArtist {
    String name;
    int age;

    MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String hello() {
        return name + " " + age;
    }


}
