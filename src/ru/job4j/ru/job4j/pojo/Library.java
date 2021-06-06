package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("One", 1);
        Book book2 = new Book("Two", 2);
        Book book3 = new Book("Three", 3);
        Book book4 = new Book("Four", 4);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        books[0].setName("Clean code");

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());

        }
        books[0] = book3;
        books[2] = book1;
        System.out.println(" ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());

        }
        System.out.println();
        for (Book b: books) {
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " " + b.getCount());
            }
        }

    }
}
