package BOJ.javaAlgo.before;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class boj16170 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zonedDateTime.getYear());
        System.out.println(zonedDateTime.getMonthValue());
        System.out.println(zonedDateTime.getDayOfMonth());
    }
}