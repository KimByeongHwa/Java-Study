package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Kim");
        book2.displayInfo();

        Book book3 = new Book("JPA Programming", "Lee", 300);
        book3.displayInfo();
    }
}
