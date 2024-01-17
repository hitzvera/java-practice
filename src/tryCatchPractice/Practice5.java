package tryCatchPractice;

import tryCatchPractice.CustomException.NoVowelsException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Practice5 {

    public static final Logger logger = Logger.getLogger(Practice5.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string: ");
        String s = scanner.nextLine();

        try {
            checkVowels(s);
            System.out.println(s + " has/have vowels");
        } catch (NoVowelsException e) {
            logger.log(Level.SEVERE, "there are no vowels in the string", e);
        }
    }

    public static void checkVowels(String s) throws NoVowelsException {
        if(!s.matches(".*[aiueoAIUEO].*")) {
            throw new NoVowelsException("there are no vowels");
        }
    }


}


