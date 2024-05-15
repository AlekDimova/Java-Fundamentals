package basicSyntax.exercises;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine(); //1. enter input data -> username
        String password = ""; //2. password -> username reversed

        //username: "Acer" -> password: "recA"
        //first symbol -> 0 position
        //last symbol -> length - 1

        //last position -> first
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position); //1. we took symbol of the current position
            password += currentSymbol; //2. we add the current symbol to the password
        }
        //until, now we have created the password we need

        //repeating action: we enter a password as an input
        //we stop when the passwords match: entered password == password
        //we continue if the passwords doesn't match: entered password != password

        String enteredPassword = scanner.nextLine(); //THE ENTERED PASSWORD
        int countFailedTries = 0; //number of unsuccessful attempts
        while (!enteredPassword.equals(password)) {
            //wrong entered password
            countFailedTries++;
            //1. check for blocking
            if (countFailedTries == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            //2. incorrect password. try again
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //correct password
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
