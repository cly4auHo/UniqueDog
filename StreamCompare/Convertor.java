package lesso8;

import java.util.*;
import java.util.stream.Collectors;

public class Convertor<T> {

    public TreeSet<Dog> getUniqueDogs(List<Dog> listDogs, Fields field) {
        switch (field) {
            case NAME:
                return getUniqueDogsName(listDogs);
            case AGE:
                return getUniqueDogsAge(listDogs);
            default:
                return null;
        }
    }

    private TreeSet<Dog> getUniqueDogsName(List<Dog> listDogs) {
        return listDogs.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<Dog>(Comparator.comparing(Dog::getName))));
    }

    private TreeSet<Dog> getUniqueDogsAge(List<Dog> listDogs) {
        return listDogs.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<Dog>(Comparator.comparing(Dog::getAge))));
    }
}

