import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class LibraryManager {

    public LibraryManager() {
        run();
    }

    private Item[] library = new Item[100];
    private int itemCount = 0;
    private Scanner sc = new Scanner(System.in);



    public void run() {
        while (true) {
            System.out.println("1. 책 추가 | 2. 잡지 추가 | 3. 신문 추가 | 4. 모든 항목 보기 | 5. 프로글램 종료");
            System.out.print("옵션을 선택하세요: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("제목, 저자, 출판 날짜, 장르: ");
                    Book book = new Book(sc.next(), sc.next(), sc.next(), sc.next());
                    library[itemCount++] = book;
                    break;

                case 2:
                    System.out.print("제목, 저자, 출판 날짜, 장르: ");
                    Magazine magazine = new Magazine(sc.next(), sc.next(), sc.next(), sc.next());
                    library[itemCount++] = magazine;
                    break;

                case 3:
                    System.out.print("제목, 저자, 출판 날짜, 장르: ");
                    Newspaper newspaper = new Newspaper(sc.next(), sc.next(), sc.next(), sc.next());
                    library[itemCount++] = newspaper;
                    break;

                case 4:
                    for (itemCount = 0; itemCount < library.length; itemCount++) {
                        if(library[itemCount] != null) {
                            library[itemCount].display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
