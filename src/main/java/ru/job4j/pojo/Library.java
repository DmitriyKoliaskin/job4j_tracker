package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 31241);
        Book money = new Book("Время деньги", 653);
        Book kolobok = new Book("Kolobok", 33);
        Book braveNewWorld = new Book("BraveNewWorld", 450);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = money;
        books[2] = kolobok;
        books[3] = braveNewWorld;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPageCount());
        }

        System.out.println("\n" + "Replace 0 to 3" + "\n");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPageCount());
        }

        System.out.println("\n" + "Shown only book Clean Code" + "\n");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPageCount());
            }
        }
    }
}
