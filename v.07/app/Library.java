package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {

    public static void main(String[] args) {
        final String appName ="Biblioteka v0.7";
        Book[] array1=new Book[1000];  // dodano tablice jednowymiarowe

        array1[0]=new Book("W pustyni i w puszczy", "Henryk Sienkiewicz ", 2010,
                296, "Greg", "9788373271890" );
        array1[1]= new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352, "Helion",
                "9788324620845");
        array1[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
                2008, 851, "McGraw-Hill Osborne Media");


        System.out.println(appName);
        System.out.println("Pojemność biblioteki to "+array1.length+" książek.");
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println();
                
        array1[0].printInfo();
        array1[1].printInfo();
        array1[2].printInfo();

    }
}
