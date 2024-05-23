public class Item {
    private String title;
    private String author;
    private String publicationData;

    public Item(String title, String author, String publicationData) {
        this.title = title;
        this.author = author;
        this.publicationData = publicationData;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationData() {
        return publicationData;
    }

    public void display(){
        System.out.print("제목: " + title+", 저자: "+author+", 출판 날짜: "+publicationData);
    }

}
