package ar.com.ada.opp.Zoo;

public class Animal {

    private Integer legs;

    public Animal() {
    }

    public Animal(Integer legs) {
        this.legs = legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Integer getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return "Animal: legs " + this.legs;

    }


}
