import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeDemo {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        String date = "2011-12-03";
        //OffsetDateTime date1 = OffsetDateTime.parse(date, dateTimeFormatter);

        String datum = "2013-04-19 23:35:12";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.of("Europe/Berlin"));
        ZonedDateTime datetime = ZonedDateTime.parse(datum, formatter);

        System.out.println(datetime.getZone()); // prints "Europe/Berlin"
        System.out.println(datetime.getOffset()); // prints "+02:00" (for this time of year)
        System.out.println(datetime.toOffsetDateTime());

        //System.out.println(ZonedDateTime.parse(date,DateTimeFormatter.ISO_DATE).toOffsetDateTime());
    }
}
