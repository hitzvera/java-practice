package tryCatchPractice;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Practice2 {
    private static final Logger logger = Logger.getLogger(Practice2.class.getName());
    public static void main(String[] args) {
        try {
            int n = 7;
            checkNumber(n);
            System.out.println(n + " is even.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "the number is odd", e);
        }
    }

    public static void checkNumber (int a) throws Exception {
        if(a % 2 == 1) {
            throw new IllegalArgumentException ("the number is odd");
        }
    }
}
