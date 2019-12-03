public class Calculator {
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
