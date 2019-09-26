package model;

public class Book {
//pola

    private String title;      //pola private zgodne z konwencja JavaBeans
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;
//konstruktory

    public Book(String title, String author, int releaseDate,
         int pages, String publisher, String isbn){
        setTitle(title);                                 //dodano zastosowanie setterów oraz getterów wymagane miedzy innymi w bibliotece Hibernate
        setAuthor(author);
        setReleaseDate(releaseDate);
        setPages(pages);
        setPublisher(publisher);
        setIsbn(isbn);
    }
    public Book(String title, String author, int releaseDate, //drugi konstruktor dzięki któremu pomijamy konieczność dodawania isbn
         int pages, String publisher){
        setTitle(title);
        setAuthor(author);
        setReleaseDate(releaseDate);
        setPages(pages);
        setPublisher(publisher);
    }

    public void printInfo()
    {

            String info = getTitle() + "; " + getAuthor() + "; " + getAuthor() + "; "
                    + getAuthor() + "; " + getPublisher();
        if (getIsbn()!= null){
            info = info+";"+isbn;
        }
            System.out.println(info);

    }

    //gettery i settery

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
//    W konstruktorach korzystamy ze słowa kluczowego this. Wykorzystujemy je zarówno do tego, żeby odróżnić od siebie
//        pola klasy i parametry konstruktorów, które się pokrywają, ale także do wywołania jednego konstruktora z drugiego.
//        Pozwala to zaoszczędzić kilka duplikujących się linii kodu.