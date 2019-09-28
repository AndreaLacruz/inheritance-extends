package ar.com.ada.opp.Zoo;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;
    private Integer age;

    public Dog() {
    }

    public Dog(Integer legs, String breed, Integer age) {
        super(legs);
        this.age = age;
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Animal legs " + this.getLegs() + " breed " + this.breed + " age " + this.age;
    }

    @Override
    public int hashCode() {
        return -33 * Objects.hash(this.breed, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Dog that = (Dog) obj;

        boolean tmp = this.breed.equals(that.breed) && this.age.equals(that.age);

        return tmp;
    }
}
