package com.example.ruff;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

public class OffsetDateTimeTest {

    public static void main(String[] args) {
        //System.out.println(parseDateString(""));
        String NM1 = "27-OCT-20";
        String CATALOG = "2020-10-27T00:00:00Z";
        SimpleDateFormat formatNM1 = new SimpleDateFormat("dd-MMM-yy");
        formatNM1.setTimeZone(TimeZone.getTimeZone("Z"));

        try {
            Date date = formatNM1.parse(NM1);
            System.out.println("NM1 As Is.. : " + date);
            OffsetDateTime offset = date.toInstant().atOffset(ZoneOffset.of("Z"));

            System.out.println("NM1 : " + offset.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
            System.out.println("CATALOG : " + OffsetDateTime.parse(CATALOG));
            System.out.println(" Both Format toLocalDate: \nNM1 : " + offset.toLocalDate() + "  , \nCATALOG: " + OffsetDateTime.parse(CATALOG).toLocalDate()  );
            System.out.println(" Are they Equal , Objects.equals: " + Objects.equals(offset.toLocalDate() , OffsetDateTime.parse(CATALOG).toLocalDate())  );

            String  unmarshal = offset.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            OffsetDateTime date1 = OffsetDateTime.parse(unmarshal, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            System.out.println("Unmarshal : " + date1);
        } catch (ParseException e) {
            System.out.println("ERROR" );
            e.printStackTrace();
        }

       /* DateTimeFormatter parser = DateTimeFormatter.ofPattern("[dd-MMM-yy]").withLocale(Locale.CANADA);
        LocalDate dt = LocalDate.parse("10-JUL-21", parser);
        System.out.println(dt.toString());*/

    }

    private static OffsetDateTime parseDateString(String dateString){
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.of("Europe/Berlin"));
        return ZonedDateTime.parse(dateString, formatter).toOffsetDateTime();
    }


}
