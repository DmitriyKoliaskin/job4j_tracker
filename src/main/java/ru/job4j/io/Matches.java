package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches <= Math.min(3, count)) {
                turn = !turn;
                count -= matches;
                System.out.println("Спичек осталось: " + count);
            } else if (matches > 0 && matches < 4 && matches > count) {
                System.out.println("Спичек меньше чем ты хочешь взять, попробую еще раз.");
            } else {
                System.out.println("Ты можешь взять количество спичек от 1 до 3, попробуй еще раз.");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
