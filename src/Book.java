public class Book {

        String title;
        String author;
        int year;

        // Конструктор
        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        // Метод для вывода информации о книге
        void displayInfo() {
            System.out.println("Название: " + title);
            System.out.println("Автор: " + author);
            System.out.println("Год издания: " + year);
            System.out.println();
        }

        // Точка входа
        public static void main(String[] args) {
            Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
            Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 1866);
            Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1967);

            book1.displayInfo();
            book2.displayInfo();
            book3.displayInfo();
        }
    }


