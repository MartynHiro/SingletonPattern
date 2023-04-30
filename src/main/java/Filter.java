import java.util.List;

public class Filter {
    private final int threshold; //наш порог для фильтра

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance(); //создаем или получаем уже имеющийся логгер

        List<Integer> result;

        logger.log("Запускаем фильтрацию");

//выводим информацию о всех числах на основе нашего порога прохождения
        source.forEach(number -> logger.log("Элемент \"" + number +
                (number <= threshold ? "\" проходит" : "\" не проходит")));

//список уже без элементов за пределами порога
        result = source.stream()
                .filter(number -> number <= threshold)
                .toList();

        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());

        return result;
    }
}
