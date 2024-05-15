package objectsAndClasses.exercises.articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine(); //"Holy Ghost, content, John Sandford"
        String[] articleParts = articleData.split(", ");// ["Holy Ghost", "content", "John Sandford"]
        String title = articleParts[0]; //Holy Ghost
        String content = articleParts[1]; //content
        String author = articleParts[2]; //John Sandford

        Article article = new Article(title, content, author); //create article

        int n = Integer.parseInt(scanner.nextLine()); //number of commands - 3
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine(); //ChangeAuthor:  Mitch Albom

            if (command.contains("Edit")) {
                String newContent = command.split(": ")[1];
                article.edit(newContent);
            } else if (command.contains("Rename")) {
                String newTitle = command.split(": ")[1];
                article.rename(newTitle);
            } else if (command.contains("ChangeAuthor")) {
                String newAuthor = command.split(": ")[1]; //Mitch Albom
                article.changeAuthor(newAuthor);
            }
        }

        System.out.println(article.toString());
    }
}
