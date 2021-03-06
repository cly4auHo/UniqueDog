package lesso8;

import java.util.*;
import java.util.stream.Collectors;

public class Handler {

    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        List<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("kek", 1));
        dogs.add(new Dog("kek", 1));
        dogs.add(new Dog("kek9", 1));
        dogs.add(new Dog("kek", 12));
        dogs.add(new Dog("kek2", 13));

        System.out.println("List values .....");

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("\nNew values .....");

        Dog.setParamOfUnique(Fields.AGE);
        dogs = convertor.getUniqueDogs(dogs, Fields.AGE);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
