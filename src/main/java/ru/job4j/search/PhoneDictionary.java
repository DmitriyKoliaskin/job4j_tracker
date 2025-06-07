package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */

    public ArrayList<Person> find(String key) {
        Predicate<Person> namePredicate = s -> s.getName().contains(key);
        Predicate<Person> surNamePredicate = s -> s.getSurname().contains(key);
        Predicate<Person> adressPredicate = s -> s.getAddress().contains(key);
        Predicate<Person> phonePredicate = s -> s.getPhone().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (namePredicate
                    .or(surNamePredicate)
                    .or(adressPredicate)
                    .or(phonePredicate)
                    .test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
