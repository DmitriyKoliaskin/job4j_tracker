package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        Predicate<Product> predicate = s -> (s.getStandard() - s.getActual() >= 0
                && s.getStandard() - s.getActual() <= 3);
        return products.stream()
                .filter(predicate)
                .map(p -> new Label(p.getName(), p.getPrice() / 2).toString())
                .collect(Collectors.toList());
    }
}