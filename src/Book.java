public class Book extends Item {
    private String genre;

    public Book(String title, String author, String publicationData, String genre) {
        super(title, author, publicationData);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("장르: "+genre);
    }
}
