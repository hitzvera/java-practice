package tryCatchPractice;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Practice1 {

    private static final Logger logger = Logger.getLogger(Practice1.class.getName());


    public static void main(String[] args) {
        try {
            throw new NullPointerException("this has some error");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "can't be null", e);
        }
    }
}
