import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List> phoneBook = new HashMap<>();
        Task.addContact("Иван Иванов", "111", phoneBook);
        Task.addContact("Анна Крутова", "555", phoneBook);
        Task.addContact("Петр Лыков", "777", phoneBook);
        Task.addContact("Иван Иванов", "999", phoneBook);
        Task.addContact("Иван Иванов", "141414", phoneBook);
        Task.addContact("Анна Крутова", "161616", phoneBook);
        Task.addContact("Петр Лыков", "191919", phoneBook);
        Task.addContact("Иван Мечников", "202020", phoneBook);
        Task.addContact("Петр Лыков", "222222", phoneBook);
        Task.print(phoneBook);

        System.out.println();

        String[] employees = {"Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Иван Иванов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Иван Иванов",
                "Мария Рыкова",
                "Анна Крутова",
                "Марина Лугова",
                "Анна Владимирова",
                "Петр Лыков",
                "Иван Мечников",
                "Петр Петин",
                "Петр Лыков",
                "Иван Ежов"};
        Task2.sortingEmployees(employees);

        System.out.println();

        System.out.println(Task3.romanToArabic("MMXXII"));
    }
}