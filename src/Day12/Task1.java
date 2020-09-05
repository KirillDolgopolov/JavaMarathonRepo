package Day12;
//comment for commit
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> autos = new ArrayList<>();
        autos.add("Toyota");
        autos.add("Honda");
        autos.add("Seat");
        autos.add("Fiat");
        autos.add("Ford");
        System.out.println(autos);

        autos.add(3, "Montesa");
        autos.remove(0);
        System.out.println(autos);

    }
}


