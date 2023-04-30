import java.util.List;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        MethodsShelf methods = new MethodsShelf();

        final List<Integer> listFromUser;
        final Filter filter;
        final List<Integer> resultList;

        final int listSize;
        final int threshold;
        final int numberForFilter;

        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");

        listSize = methods.choice("Введите размер списка:");

        threshold = methods.choice("Введите верхнюю границу для значений:");

        logger.log("Создаём и наполняем список");

        listFromUser = methods.listCreating(listSize, threshold);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        numberForFilter = methods.choice("Введите порог для фильтра ниже верхней границы списка" +
                " (ваша верхняя граница в списке была: " + threshold + "):");

        filter = new Filter(numberForFilter);

        resultList = filter.filterOut(listFromUser);

        logger.log("Выводим результат на экран");

        System.out.println("Отфильтрованный список: " + resultList);

        logger.log("Завершаем программу");
    }
}
