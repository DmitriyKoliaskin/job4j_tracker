package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println(this.active + " " + this.status + " " + this.message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 23, "Pau-pau");
        Error error2 = new Error(false, 1234545, "Tra-ta-ta");
        error.print();
        error1.print();
        error2.print();
    }
}
