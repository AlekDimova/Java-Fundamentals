package textProcessing.exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());//"923847238931983192462832102"
        BigInteger secondNumber =  new BigInteger(scanner.nextLine()); // "2"

        System.out.println(firstNumber.multiply(secondNumber));
    }
}
