import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        Thread th = new Thread(numberGenerator);
        thread.setPriority(01);
        th.setPriority(01);
        thread.setPriority(10);
        th.setPriority(10);
        thread.start();
        th.start();


    }
}