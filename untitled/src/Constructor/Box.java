package Constructor;

public class Box {
    public Double length;

    public Double breadth;
    public  Double height;

    public Box(){
        this.length = 11.0;
        this.breadth = 34.0;
        this.height = 12.0;

    }
    public  Box(Double length){
        this.length = length;
        this.breadth = breadth;
        this.height = height;

    }

    public Box(Double length, Double breadth, Double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void volume(){
        System.out.println("This volume of the box is " + this.length * this.breadth * this.height);
    }
}
