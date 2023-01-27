import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(now, LocalDate.of(2024, 1, 1));

        LocalDate nextMonth = LocalDate.of(2023, 2 , 1);


        System.out.println("Days till end of month: " + (nextMonth.getDayOfYear() - now.getDayOfYear()));
        System.out.println("Days till end of the year: " + days);









    }
}
