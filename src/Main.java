import com.sun.source.tree.Tree;
import jdk.jfr.Frequency;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("word", "word", "word", "num", "letter"));
        task4(List.of("word", "word", "word","Word", "word", "Word", "W", "ww", "w"));

    }

    private static void task1(List<Integer> numbers) {
        System.out.println("Задание 1");
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    private static void task2(List<Integer> numbers) {
        System.out.println("Задание 2");
        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words) {
        System.out.println("Задание 3");
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }

    private static void task4(List<String> words) {
        System.out.println("Задание 4");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 0);
            }
                map.replace(word, map.get(word)+ 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Слово " + entry.getKey() + " повторяется раз: " + entry.getValue());
        }
        System.out.println();
    }
}