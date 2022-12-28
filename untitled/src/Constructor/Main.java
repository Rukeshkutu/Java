package Constructor;

public class Main {
    public static void main(String[] arg){
        Box box = new Box();
        box.volume();

        Box box1 = new Box(10.0, 20.0, 30.0);
        box1.volume();

    }
}
