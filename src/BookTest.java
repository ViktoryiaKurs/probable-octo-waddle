public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 1866);
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1967);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        System.out.println(book1.getAuthor());
        book1.setTitle("Анна Каренина");
        System.out.println("Новое название книги: "+book1.getTitle());
    }
}
