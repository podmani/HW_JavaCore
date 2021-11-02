package HW4;

import java.util.*;

public class Main4 {
    public static void main(String[] args){

        // Задание 1
        List<String> words = Arrays.asList(
                "Вирусы", "Черви", "Трояны", "Шпионское ПО", "Рекламное ПО",
                "Боты", "Черви", "Баги", "Руткиты", "Программы-вымогатели",
                "Трояны", "Черви", "Баги", "Черви", "Руткиты"
        );

        Set<String> unique = new HashSet<String>(words);
        System.out.println("Задание 1:");
        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

        // Задание 2
        Phonebook phonebook = new Phonebook();
        System.out.println("");
        System.out.println("задание 2:");
        System.out.println("Наполняем справочник");
        phonebook.add("Ищенко", "9036664455");
        phonebook.add("Разин", "9998887744");
        phonebook.add("Чехина", "9200004422");
        phonebook.add("Ищенко", "9518882255");
        phonebook.add("Разин", "9305554422");

        System.out.println("Получаем номера");
        System.out.println("Ищенко");
        System.out.println(phonebook.get("Ищенко"));
        System.out.println("Разин");
        System.out.println(phonebook.get("Разин"));
        System.out.println("Чехина");
        System.out.println(phonebook.get("Чехина"));

        System.out.println("Случай отсутствия записи");
        System.out.println("Левченко");
        System.out.println(phonebook.get("Левченко"));

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Ищенко", "9518882255");
        System.out.println("Ищенко");
        System.out.println(phonebook.get("Ищенко"));
    }
}
