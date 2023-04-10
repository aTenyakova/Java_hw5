// 2) Пусть дан список сотрудников. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.*;

public class Task2 {
    public static void sortingEmployees(String[] employees) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String employee : employees) {
            countMap.put(employee, countMap.getOrDefault(employee, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(countMap.entrySet());
        sortedEntries.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        System.out.println("Повторяющиеся имена:");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}