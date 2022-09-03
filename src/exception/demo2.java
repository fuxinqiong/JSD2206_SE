package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class demo2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("fos.txt");
        }catch (RuntimeException e){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
