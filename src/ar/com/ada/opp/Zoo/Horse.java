package ar.com.ada.opp.Zoo;

import java.util.Objects;

public class Horse extends Animal {

    private String name;
    private Integer power;

    public Horse() {
    }

    public Horse(Integer legs, String name, Integer power) {
        super(legs);
        this.name = name;
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Animal: legs " + this.getLegs() + " name " + this.name + " power " + this.power;

    }

    @Override
    public int hashCode() {
        return -33 * Objects.hash(this.name, this.power);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Horse that = (Horse) obj;

        boolean tmp = this.name.equals(that.name) && this.power.equals(that.power);

        return tmp;

    }
}
