import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public void calculator () {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will multiply or add an array of numbers, " +
                "please press 1 to multiply or 2 to add them: ");
        int opt = input.nextInt();
        String option = "multiply";
        if (opt == 1) {
            option = "add";
        } else {
            System.err.println("Wrong option!, please enter 1 to multiply or 2 to add: ");
            opt = input.nextInt();
        }
        System.out.println("How many numbers do you want to " + option + ": ");
        int size = input.nextInt();

        System.out.println("Now please enter the numbers and I will operate them for you: ");
        String numbers = "";
        int i = 0;
        while (i <= size-1) {
            numbers[i++] = String.valueOf(input.nextDouble());
        }
        switch (opt) {
            case 1:
                multiply(Double.valueOf(numbers));
                break;
            case 2:
                add(Double.valueOf(numbers));
                break;
        }
    }

    //method for multiplication
    static double multiply (double... numbers) {
        double product = 0;
        int i = 0;
        while (i < numbers.length) {
            product *= numbers[i++];
        }
        return product;
    }

    //method for addition
    static double add (double... numbers) {
        double sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i++];
        }
        return sum;
    }
}
