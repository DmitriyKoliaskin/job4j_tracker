package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс реализует работу банковского сервиса,
 * взаимодействие пользователей с их счетами
 * @author Dmitriy Koliaskin
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение данных осуществляется в коллекции типа Map<User, List<Account>>
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя
     * @param user это пользователь которого добавляем в коллекцию
     *             и создаем ему список счетов
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет пользователя по паспорту из колекции
     * @param passport данные по которым метод удаляет пользователя
     * @return если пользователь удален возвращает true, иначе false
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет пользователю по паспорту счет
     * @param passport данные о пользователе
     * @param account счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
           List<Account> accounts = users.get(user);
           if (!accounts.contains(account)) {
               accounts.add(account);
           }
        }
    }

    /**
     * Метод находи в коллекции пользователя по паспорту
     * @param passport данные по пользователе
     * @return если такой пользователь существует в коллекции,
     * то возвращает его, иначе null
     */
    public User findByPassport(String passport) {
        for (var user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод находит у пользователя счет
     * @param passport данные о пользователе
     * @param requisite данные о счете
     * @return если такой счет существует у пользователя,
     * то возвращает его, иначе null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = getAccounts(user);
            for (var account : list) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит сумму с одного счета на другой
     * @param srcPassport пользователь с чьего счет произойдет списание суммы
     * @param srcRequisite счет с которого произойдет списание суммы
     * @param destPassport пользователь на чей счет придет списанная сумма
     * @param destRequisite счет на который придет списанная сумма
     * @param amount сумма перевода
     * @return если перевод произойдет то вернет true, иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account accountSrc = this.findByRequisite(srcPassport, srcRequisite);
        Account accountDest = this.findByRequisite(destPassport, destRequisite);
        if (accountSrc == null
                || accountDest == null
                || accountSrc.getBalance() < amount) {
            return false;
        }
        accountSrc.setBalance(accountSrc.getBalance() - amount);
        accountDest.setBalance(accountDest.getBalance() + amount);
        return true;
    }

    /**
     * Метод возращает список счетов пользователя
     * @param user пользователь
     * @return возращает список счетов пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
