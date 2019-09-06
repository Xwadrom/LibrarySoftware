public class Book {


    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String title, String author, int releaseDate,
         int pages, String publisher, String isbn){
              this (title, author, releaseDate, pages, publisher);//dzieki zastosowaniu this skracamy kod
              this.isbn = isbn;
    }
    Book(String title, String author, int releaseDate, //konstruktor dzięki któremu pomijamy konieczność dodawania isbn
         int pages, String publisher){
              this.title = title;
              this.author = author;
              this.releaseDate = releaseDate;
              this.pages = pages;
              this.publisher = publisher;
    }

    void printInfo(){
        String info = title + "; " + author + "; " + releaseDate + "; "
                + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }

}
//    W konstruktorach korzystamy ze słowa kluczowego this. Wykorzystujemy je zarówno do tego, żeby odróżnić od siebie
//        pola klasy i parametry konstruktorów, które się pokrywają, ale także do wywołania jednego konstruktora z drugiego.
//        Pozwala to zaoszczędzić kilka duplikujących się linii kodu.