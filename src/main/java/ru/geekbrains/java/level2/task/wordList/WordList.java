package ru.geekbrains.java.level2.task.wordList;

import java.util.*;

public class WordList {
    public static void main(String[] args) {
        LinkedList<String> wordList = new LinkedList<>(Arrays.asList(
                "понедельни",
                "понедельни",
                "понедельни",
                "вторник",
                "вторник",
                "среда",
                "четверг",
                "четверг",
                "четверг",
                "четверг",
                "четверг",
                "пятница",
                "пятница",
                "суббота",
                "воскресенье",
                "воскресенье"
        ));
        System.out.println("Исходный список");
        System.out.println(wordList);
        System.out.println("Список без дубликатов");
        LinkedList<String> uniqueWordList = getListUniqueWords(wordList);
        System.out.println(uniqueWordList);
        System.out.println("Сколько раз встречаются слова");
        HashMap<String, Integer> wordHashMap = getHashMap(wordList);
        for (Map.Entry<String,Integer> o: wordHashMap.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }

    /**
     * Получает в качестве параметра список слов,
     * возвращает список без дубликатов
     * @param wordList список слов
     * @return список слов без дубликатов
     */
    private static LinkedList<String> getListUniqueWords (LinkedList<String> wordList) {
        HashSet<String> wordSet = new HashSet<>();
        LinkedList<String> uniqueWordList = new LinkedList<>();
        Iterator<String> iterList = wordList.iterator();
        while (iterList.hasNext()) {
            String str = iterList.next();
            wordSet.add(str);
        }
        Iterator<String> iterSet = wordSet.iterator();
        while (iterSet.hasNext()) {
            String str = iterSet.next();
            uniqueWordList.add(str);
        }
        return uniqueWordList;
    }
    /**
     * Получает в качастве параметра список слов
     * возвращает HashMap где в качастве ключа слово, а
     * в качестве значения колличество раз которое оно встречается
     * в полученном списке
     */
    private static HashMap<String, Integer> getHashMap (LinkedList<String> wordList) {
        HashMap<String, Integer> wordHashMap = new HashMap<>();
        LinkedList<String> uniqueWordsList = getListUniqueWords(wordList);
        for (String uniqueWord : uniqueWordsList) {
            int countWord = 0;
            for (String word: wordList) {
                if (uniqueWord == word) {
                    countWord++;
                }
            }
            wordHashMap.put(uniqueWord, countWord);
        }
        return wordHashMap;
    }
}
