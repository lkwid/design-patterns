import model.HobbyCartoons;
import model.HobbyGaming;
import model.Kid;

import java.util.Arrays;
import java.util.List;

public class StrategyApp {

    public static void main(String[] args) {

        Kid gabi = new Kid("Gabi", new HobbyCartoons());
        Kid marti = new Kid("Marti", new HobbyGaming());

        List<Kid> kidos = Arrays.asList(gabi, marti);

        kidos.forEach(kid -> System.out.println(kid.toString() + kid.getHobby().tell()));

        gabi.setHobby(new HobbyGaming());

        kidos.forEach(kid -> System.out.println(kid.toString() + kid.getHobby().tell()));
    }

}
