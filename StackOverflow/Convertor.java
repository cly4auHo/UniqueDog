package lesso8;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Convertor<T> {

    public List<Dog> getUniqueDogsName(List<Dog> listDogs) {
        return listDogs.stream().filter(distinctByKey(Dog::getName)).collect(Collectors.toList());
    }

    public List<Dog> getUniqueDogsAge(List<Dog> listDogs) {
        return listDogs.stream().filter(distinctByKey(Dog::getAge)).collect(Collectors.toList());
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}

