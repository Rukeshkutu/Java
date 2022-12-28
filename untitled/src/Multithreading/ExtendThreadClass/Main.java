package Multithreading.ExtendThreadClass;

public class Main {
    public static void main(String[] args){
        SequencePrinterThread sequencePrinter = new SequencePrinterThread(0, 5);
        sequencePrinter.setName("Sequence Printer First");

        SequencePrinterThread sequencePrinter1 = new SequencePrinterThread(6, 10);
        sequencePrinter1.setName("Sequence Printer Second");

        sequencePrinter.start();
        sequencePrinter1.start();
    }
}
