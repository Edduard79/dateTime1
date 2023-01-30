import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Year;


public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        LocalDate now = LocalDate.now();

        int endOfMonth = now.lengthOfMonth() - now.getDayOfMonth();
        System.out.printf("End of month comes in: %d day/s!\n", endOfMonth);

       /* int ca = now.getDayOfYear();
        int c = Year.of(now.getYear()).length();
        System.out.println(c + " "+ ca);*/

        int endOfYear = Year.of(now.getYear()).length() - now.getDayOfYear();
        System.out.printf("End of the year comes in: %d day/s!\n", endOfYear);

    }
}
