package tryCatchPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Practice3 {

    private static final Logger logger = Logger.getLogger(Practice3.class.getName());

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/something.txt");
            int i;
            while((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            logger.log(Level.WARNING, "file not found", e);
        } catch (IOException e){
            logger.log(Level.WARNING, "something is wrong", e);
        }


    }
}
