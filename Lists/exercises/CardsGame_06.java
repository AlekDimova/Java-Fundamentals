package lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //{20 30 40 50}
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //{10 20 30 40}

        while (firstPlayerCards.size() != 0 && secondPlayerCards.size() != 0) {
            int firstPlayerCard = firstPlayerCards.get(0);
            int secondPlayerCard = secondPlayerCards.get(0);
            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);

            //the logic of the card game
            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerCards.add(secondPlayerCard);
                secondPlayerCards.add(firstPlayerCard);
            }
        }

        //1. the game ends if 1st player doesn't have cards anymore
        if (firstPlayerCards.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", getCardsSum(secondPlayerCards));
        }
        //2. the game ends if 2nd player doesn't have cards anymore
        else if (secondPlayerCards.size() == 0) {
            System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayerCards));
        }
    }

    //method to get the sum of the cards
    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }
        return sum;
    }
}
