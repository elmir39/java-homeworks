package hw01_number_guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userNum, count = 0;
        int[] numbers = new int[10];
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Let the game begin");

        int target = random.nextInt(101);

        while (true) {


            while (true) {
                System.out.print("Enter a number: ");

                if (scanner.hasNextInt()) {
                    userNum = scanner.nextInt();
                    break;
                } else {
                    System.out.println("That's not a number!");
                    scanner.next();
                }
            }

            numbers[count] = userNum;
            count += 1;

            if (count == numbers.length) {
                numbers = Arrays.copyOf(numbers, numbers.length * 2);
            }

            if (userNum < target) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (userNum > target) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
        numbers = Arrays.copyOf(numbers, count);
        System.out.print("Your numbers: ");
        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}