import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    // Метод, возвращающий массив с уникальными значениями
    public static int[] getUniqueValues(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
    }

    // Функция, возвращающая множество уникальных символов в строке
    public static Set<Character> getUniqueCharacters(String str) {
        char[] charArray = str.toCharArray();
        Set<Character> uniqueSet = new HashSet<>();
        for (char ch : charArray) {
            uniqueSet.add(ch);
        }
        return uniqueSet;
    }

    // Программа, проверяющая, содержит ли множество только нечетные числа
    public static boolean containsOnlyOddNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    // Метод, объединяющий два множества без повторений
    public static Set<Integer> unionOfSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static void main(String[] args) {
        // Примеры использования

        // Пример для getUniqueValues
        int[] inputArray = {1, 2, 3, 4, 3, 2, 5};
        int[] uniqueValues = getUniqueValues(inputArray);
        System.out.println("Уникальные значения: " + Arrays.toString(uniqueValues));

        // Пример для getUniqueCharacters
        String inputString = "hello world";
        Set<Character> uniqueCharacters = getUniqueCharacters(inputString);
        System.out.println("Уникальные символы: " + uniqueCharacters);

        // Пример для containsOnlyOddNumbers
        int[] oddNumbers = {1, 3, 5, 7};
        int[] mixedNumbers = {1, 2, 3, 4, 5};
        System.out.println("Множество содержит только нечетные числа: " + containsOnlyOddNumbers(oddNumbers));
        System.out.println("Множество содержит только нечетные числа: " + containsOnlyOddNumbers(mixedNumbers));

        // Пример для unionOfSets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> unionSet = unionOfSets(set1, set2);
        System.out.println("Объединение множеств: " + unionSet);
    }
}