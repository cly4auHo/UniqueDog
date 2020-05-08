package lesso8;

import java.util.*;

public class Handler {

    public static void main(String[] args) {
        Convertor convertor = new Convertor();
        List<Dog> alphaList = new ArrayList<Dog>();

        alphaList.add(new Dog("kek", 1));
        alphaList.add(new Dog("kek", 1));
        alphaList.add(new Dog("kek9", 1));
        alphaList.add(new Dog("kek", 19));
        alphaList.add(new Dog("kek2", 13));

        System.out.println("List values .....");

        for (Dog alpha : alphaList) {
            System.out.println(alpha);
            convertor.listToSet(alpha, alpha.getAge());
        }

        System.out.println("\nNew values .....");

        Map map = convertor.getDogs();
        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
    }
}
