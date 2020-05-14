package lesso8;

import java.util.*;

public class Handler {

    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        List<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("kek", 1));
        dogs.add(new Dog("kek", 1));
        dogs.add(new Dog("kek9", 15));
        dogs.add(new Dog("kek", 12));
        dogs.add(new Dog("kek2", 13));

        System.out.println("\nNew values .....");

        TreeSet<Dog> t = convertor.getUniqueDogs(dogs, Fields.AGE);

        for (Dog dog : t) {
            System.out.println(dog);
        }
    }
}
