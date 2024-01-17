package tryCatchPractice;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Practice4 {

    public static final Logger logger = Logger.getLogger(Practice4.class.getName());

    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbersFromUser();
            checkDuplicates(numbers);
            System.out.println("no duplicate date");
        } catch (Exception e) {
            logger.log(Level.WARNING, "duplicate entry", e);
        }
    }

    public static List<Integer> readNumbersFromUser() {
        List<Integer> container = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many numbers do you want to input: ");
        int n = scanner.nextInt();

        System.out.println("input the integers: ");
        for(int i = 0;i<n;i++) {
            int numberInputted = scanner.nextInt();
            container.add(numberInputted);
        }

        scanner.close();
        return container;

    }

    public static void checkDuplicates(List<Integer> numbers) throws Exception {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int num: numbers) {
            if(uniqueNumbers.contains(num)) {
                throw new DuplicateNumberException("there is duplicate number");
            }
            uniqueNumbers.add(num);
        }
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String msg) {
        super(msg);
    }
}