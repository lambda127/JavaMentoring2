public class Newspaper extends Item {
    private String genre;

    public Newspaper(String title, String author, String publicationData, String genre) {
        super(title, author, publicationData);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\b장르: "+genre);
    }
}
