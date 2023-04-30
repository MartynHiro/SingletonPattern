import java.util.Date;

public final class Logger {
    private static Logger instance; //хранит своё состояние
    private int counter = 1;

    private Logger() {
    }

    public static Logger getInstance() { //так как singleton может быть только один, то проверяем существует ли он
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        Date date = new Date();
//логирование наших сообщений с единым счетчиком операций для всей программы
        System.out.println("[" + date + " #" + counter++ + "] " + msg);
    }
}
