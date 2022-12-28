package FileHandling;

import  java.io.File;
import java.io.IOException;

public class Basic {
    public static void main(String[] args){
        File file = new File("newfile.txt");
        try{
            if (!file.exists()){
                file.createNewFile();
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
    }
}
