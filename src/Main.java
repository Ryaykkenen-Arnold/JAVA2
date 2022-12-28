import java.util.Scanner;

public class Main {
    static void testStr() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("Вячеслав")) {
            System.out.println("Привет, " + s);
        } else {
            System.out.println("Нет такого имени");
        }
    }
    static void testInt() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 7) {
            System.out.println("Привет");
        }
    }
    static void checkArray() {
        int[] myArray = {1,2,5,6,7,8,9,34,56,58,32,12,667,86676,324234,1232323,21};
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]%3==0){System.out.println(myArray[i]);}

        }
    }
        public static void main (String[]args){
            testStr();
            testInt();
            checkArray();
        }
    }
/*Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

Ответ: нет, нельзя
Правильный ответ: [(((((())))))]
 */