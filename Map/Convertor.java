package lesso8;

import java.util.*;

public class Convertor<T> {
    private Map<Integer, Dog> dogs = new HashMap<>();

    public Map<Integer, Dog> getDogs() {
        return dogs;
    }

    public void listToSet(Dog dog, T param) {
        if (!dogs.containsKey(param.hashCode())) {
            dogs.put(param.hashCode(), dog);
        }
    }
}

