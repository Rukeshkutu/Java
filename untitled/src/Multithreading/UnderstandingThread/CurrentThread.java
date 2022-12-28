package Multithreading.UnderstandingThread;

public class CurrentThread {
    public static void main(String[] args){
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread?: " +currentThread.getName());

        currentThread.setName("My Thread");
        System.out.println("After name changed Current Thread:");

        try{
            for(int n=5; n>5; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
