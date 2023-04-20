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
        String ln = System.lineSeparator();

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPageCount());
        }

        System.out.println(ln + "Replace 0 to 3" + ln);
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPageCount());
        }

        System.out.println(ln + "Shown only book Clean Code" + ln);
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " - " + books[i].getPageCount());
            }
        }
    }
}
