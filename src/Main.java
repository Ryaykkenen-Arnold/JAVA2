import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void testStr() {
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("Вячеслав")) {
            System.out.println("Привет, " + s);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    static void testInt() {
        System.out.println("Введите число.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 7) {
            System.out.println("Привет");
        }
    }

    static void checkArray() {
        ArrayList<Integer> array = new ArrayList();
        Scanner reader = new Scanner(System.in);
        {
            System.out.println("Ввидите числа: ");
            while (reader.hasNextInt()) {
                array.add(reader.nextInt());
            }
        }

        System.out.print("Введенные числа кратные 3: \n");
        for (int number : array) {
            if (number % 3 == 0) System.out.print(number + "\n");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        testStr();
        testInt();
        checkArray();
    }
}
/*Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

Ответ: нет, нельзя
Правильный ответ: [(((((())))))] - по-моему мнению, дана логическа последовательность скобок, таким образом на
каждую открывающую скобку должна быть закрывающая.
 */

