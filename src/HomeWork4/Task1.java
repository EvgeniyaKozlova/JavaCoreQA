package HomeWork4;

import java.util.*;

public class Task1 {

    /*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).  */
    
    public static void main(String[] args) {
        List<String> wordsArray = Arrays.asList("Красный", "Синий", "Зеленый", "Синий", "Желтый", "Белый",
                "Синий", "Красный", "Розовый", "Черный", "Синий", "Коричневый", "Желтый", "Красный");

        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        System.out.println("\nСписок без повторов: ");
        Set<String> unique = new HashSet<>(wordsArray);
        unique.forEach(System.out::println);

        //Посчитать, сколько раз встречается каждое слово.
        System.out.println("\nПодсчет слов");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : wordsArray) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);


    }

}
