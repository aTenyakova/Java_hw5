// 1) Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;

public class Task {
    private Map<String, List> phoneBook = new HashMap<>();
    public static void addContact(String name, String phoneNumber, Map<String, List> phoneBook) {
        List<String> numbers = phoneBook.get(name);
        if (numbers == null) {
            numbers = new ArrayList<>();
            phoneBook.put(name, numbers);
        }
        numbers.add(phoneNumber);
    }
    public List<String> getPhoneNumbers(String name) {
        return phoneBook.get(name);
    }
    public static void print(Map<String, List> phoneBook) {
        for (String name : phoneBook.keySet()) {
            List<String> numbers = phoneBook.get(name);
            System.out.print(name + ": ");
            for (String phoneNumber : numbers) {
                System.out.print(phoneNumber + ", ");
            }
            System.out.println();
        }
    }
}