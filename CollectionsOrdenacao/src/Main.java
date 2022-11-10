import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Cat> cats = new ArrayList<>(){{
           add(new Cat("Aristofeu", 6, "Preto"));
           add(new Cat("Oristeca", 18, "Branco"));
           add(new Cat("Destrovisk", 12, "Laranja"));
       }};

        System.out.println(cats.toString());

        Collections.shuffle(cats);
        System.out.println(cats);

        Collections.sort(cats);

        System.out.println(cats);

    }
}