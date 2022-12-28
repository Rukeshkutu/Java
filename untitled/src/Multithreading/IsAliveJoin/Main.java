package Multithreading.IsAliveJoin;

public class Main {
    public static void main(String[] args){
        NewThread ob1 = new NewThread("One");
        System.out.println("Thread One is alive: " + ob1.t.isAlive());

        try{
            System.out.println("Waiting for thread to finish.");
            ob1.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        NewThread ob2 = new NewThread("Two");
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());

        NewThread ob3 = new NewThread("Three");
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());

        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());
    }

}
