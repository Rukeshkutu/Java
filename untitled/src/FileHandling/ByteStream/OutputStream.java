package FileHandling.ByteStream;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

    static String source = "Now is the time for all good men\n" + "to come to the aid of their country\n"
            + " and pay their due taxes.";
    public static void main(String[] args) throws IOException{
        File file = new File("newfile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        byte byteArray[] = source.getBytes();

        for (int i = 0; i< byteArray.length; i ++){
            System.out.println(byteArray[i]);
            fileOutputStream.write(byteArray[i]);
        }
        fileOutputStream.close();
    }
}
