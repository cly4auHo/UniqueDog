package p;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Convertor {

    public List<Dog> dogEater(List<Dog> dogs, Fields field) {
        switch (field) {
            case AGE: return getUniqueByAge(dogs);
            case NAME: return getUniqueByName(dogs);
            case NONE:
            default:
                return dogs;
        }
    }

    private List<Dog> getUniqueByName(List<Dog> dogs) {
        Comparator<Dog> comparator = Comparator.comparing(Dog::getName);

        return dogs.stream().sorted(comparator).filter(new Predicate<Dog>() {
            Dog testDog;

            @Override
            public boolean test(Dog dog) {
                if (testDog != null && comparator.compare(testDog, dog) == 0)
                    return false;

                testDog = dog;
                return true;
            }
        }).collect(Collectors.toList());
    }

    private List<Dog> getUniqueByAge(List<Dog> dogs) {
        Comparator<Dog> comparator = Comparator.comparing(Dog::getAge);

        return dogs.stream().sorted(comparator).filter(new Predicate<Dog>() {
            Dog testDog;

            @Override
            public boolean test(Dog dog) {
                if (testDog != null && comparator.compare(testDog, dog) == 0)
                    return false;

                testDog = dog;
                return true;
            }
        }).collect(Collectors.toList());
    }
}
