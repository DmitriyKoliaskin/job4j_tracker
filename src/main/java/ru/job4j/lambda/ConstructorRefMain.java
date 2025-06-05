package ru.job4j.lambda;

public class ConstructorRefMain {
    public static void main(String[] args) {
        FuncInterface funcInterface = Model::new;
        Model model = funcInterface.function("Example");
        System.out.println("Значение равно: " + model.getName());
    }
}
