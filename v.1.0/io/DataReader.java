package io;

import model.Book;

import java.util.Scanner;

public class DataReader {

    private Scanner sc=new Scanner(System.in);//Zdefiniowaliśmy pole typu Scanner. Mógłby on też być zdefiniowany jako zmienna lokalna metody readAndCreateBook(), jednak wtedy byłby tworzony przy każdym wywołaniu tej metody.

    public void close(){//Metoda close() pozwoli nam zamknąć Scanner, gdy nie będzie już nam potrzebny w aplikacji (czyli na chwilę przed jej zakończeniem).
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook(){ // typ metody zamiast np. string, int itp. może byc nazwą klasy w tym przypadku Book i przyjmuje wtedy wszystkie zmienne z tej klasy.
        System.out.println("Tytuł: ");
        String title=sc.nextLine();
        System.out.println("Autor: ");
        String author=sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher=sc.nextLine();
        System.out.println("ISBN: ");
        String isbn=sc.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate=sc.nextInt();
        System.out.println("Ilość Stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book (title, author, releaseDate, pages, publisher, isbn);

    }
}
