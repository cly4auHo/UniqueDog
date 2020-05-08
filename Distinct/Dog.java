package lesso8;

import java.util.Objects;

public class Dog {
    private static Fields paramOfUnique;
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
          if (this == o)
                    return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Dog dog = (Dog) o;

        switch (paramOfUnique) {
            case NAME:
                return Objects.equals(this.name, dog.name);
            case AGE: {
                System.out.println(1);
                return Objects.equals(this.age, dog.age);
            }
            case NONE:
            default:           
                return Objects.equals(this.name, dog.name) && Objects.equals(this.age, dog.age);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog() {
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void setParamOfUnique(Fields paramOfUnique) {
        Dog.paramOfUnique = paramOfUnique;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
