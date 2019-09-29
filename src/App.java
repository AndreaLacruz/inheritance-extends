import ar.com.ada.opp.Zoo.Dog;
import ar.com.ada.opp.Zoo.Horse;

public class App {
    public static void main(String[] args) {

        Horse poni1 = new Horse(4, "Palomo", 234);
        Horse poni2 = new Horse(4, "Carrot", 234);

        System.out.println("poni1.toString()" + poni1.toString());
        System.out.println("poni1.hashCode()" + poni1.hashCode());
        System.out.println(poni1.equals(poni2));
        System.out.println("poni2.toString()" + poni2.toString());
        System.out.println("poni2.hashCode()" + poni2.hashCode());

        Dog puppy1 = new Dog(4,"Salchicha", 1);
        Dog puppy2 = new Dog(4,"Salchicha", 1);

        System.out.println("puppy1.toString()" + puppy1.toString());
        System.out.println("puppy1.hashCode()" + puppy1.hashCode());
        System.out.println(puppy1.equals(puppy2));
        System.out.println("puppy2.toString()" + puppy2.toString());
        System.out.println("puppy2.hashCode()" + puppy2.hashCode());
    }
}
