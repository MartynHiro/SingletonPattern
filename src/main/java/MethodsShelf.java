import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public final class MethodsShelf {
    public List<Integer> listCreating(int listSize, int threshold) {
//метод создания списка по введенным параметрам пользователя
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(threshold));
        }

        System.out.println("Вот случайный список: " + list);

        return list;
    }

    public int choice(String text) {
//метод ввода числа от пользователя с его проверкой на корректность
        int inputNumber = 1;

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println(text);

            String userInput = scanner.next();

            if (userInput.matches("^[a-zA-Z]*$")) {
                System.out.println("Надо ввести число");
                continue;

            } else if (Integer.parseInt(userInput) < 0) {
                System.out.println("Число должно быть больше нуля");
                continue;
            }
            inputNumber = Integer.parseInt(userInput);
            flag = false;
        }

        return inputNumber;
    }
}
