public class Book {

      private   String title;
       private String author;
      private   int year;

        // Конструктор
        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
        public String getTitle(){
            return title;
        }
        public String getAuthor(){
            return author;
        }
        public int getYear(){
            return year;
        }
        public void setTitle(String title){
            this.title=title;
        }
        public void setAuthor(String author){
            this.author=author;
        }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод для вывода информации о книге
        void displayInfo() {
            System.out.println("Название: " + title);
            System.out.println("Автор: " + author);
            System.out.println("Год издания: " + year);
            System.out.println();
        }

    }


