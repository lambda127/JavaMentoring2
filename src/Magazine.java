public class Magazine extends Item {
    private String genre;

    public Magazine(String title, String author, String publicationData, String genre) {
        super(title, author, publicationData);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\b장르: "+genre);
    }
}
