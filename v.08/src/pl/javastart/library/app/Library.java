package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;

public class Library {

    public static void main(String[] args) {
        final String appName ="Biblioteka v0.8";

        Book[] array1=new Book[1000];  // dodano tablice jednowymiarowe
        DataReader dataReader1= new DataReader();

        System.out.println(appName);
        System.out.println("Wprowadź nową książkę: ");
        array1[0]=dataReader1.readAndCreateBook();
        array1[1]=dataReader1.readAndCreateBook();
        dataReader1.close();

        array1[0].printInfo();
        array1[1].printInfo();
        System.out.println("Pojemność biblioteki to "+array1.length+" książek.");



    }
}
