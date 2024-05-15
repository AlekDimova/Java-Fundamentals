package objectsAndClasses.exercises.articles_02;

public class Article {
    private String title;
    private String content;
    private String author;

    //alt + insert -> Constructor
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //methods -> behavior
    public void edit (String newContent){
        this.content = newContent; // Edit (new content) – change the old content with the new one
    }

    public void changeAuthor (String newAuthor) {
        this.author = newAuthor; // ChangeAuthor (new author) – change the author
    }

    public void rename (String newTitle) {
        this.title = newTitle; // Rename (new title) – change the title of the article
    }

    //built-in method toString -> convert object to text -> "{packageName}.{className}@{address}"
    @Override // rewrites default method
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
