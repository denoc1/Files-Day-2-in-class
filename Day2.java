import java.io.*;
import java.util.*;


public class Day2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("numbers.txt"));

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            scanner.close();

            // Display numbers
            System.out.println("Numbers read from file: " + numbers);

            // Compute and display the sum
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("The sum of the integers is " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Oops, file was not found!");
        }
    }
}