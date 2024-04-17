// Note: Abstract class cannot instantiated
public class AbstractDemo1 {
    public static void main(String[] args) {
        // Lion class object
        Lion lion = new Lion();
        lion.sound();

        //Tiger class object
        Tiger tiger = new Tiger();
        tiger.sound();
    }
}
// this is abstract class
abstract class Animal {
    // this is abstract method 
    public abstract void sound();
}
// this is child class who extends/inherit super class
class Lion extends Animal {
    // here we override super class abstract method
    public void sound() {
        System.out.println("Lions Roars.");
    }
}
// this is another child class
class Tiger extends Animal {
    public void sound() {
        System.out.println("Tiger roars!");
    }
}