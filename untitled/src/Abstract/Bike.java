package Abstract;

public abstract class Bike {
    Bike(){
        System.out.println("Bike is crested");

    }
    abstract void run();

    void changeGear(){
        System.out.println("Gear Changed");
    }
}
