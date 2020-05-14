package p;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        List<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("kek", 15));
        dogs.add(new Dog("kek", 1));
        dogs.add(new Dog("kek9", 1));
        dogs.add(new Dog("kek", 12));
        dogs.add(new Dog("kek2", 13));

        dogs =convertor.dogEater(dogs, Fields.AGE);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
