import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalTime time = LocalTime.now();
            System.out.print("\rCurrent Time: " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            Thread.sleep(1000); // wait 1 second
        }
    }
}
