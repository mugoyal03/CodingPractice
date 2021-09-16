package com.example.streams;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.*;
public class StreamMin {

        public static void main(String[] args)
        {

            // Parses the date1
            OffsetDateTime date1 = OffsetDateTime.parse("2013-12-12T13:30:30+05:00");

            // Parses the date2
            OffsetDateTime date2 = OffsetDateTime.parse("2015-12-12T13:30:30+05:00");
            List<OffsetDateTime> list = Arrays.asList(date1,date2);
            // Prints both dates
            System.out.println("Date1: " + date1);
            System.out.println("Date2: " + date2);
            System.out.println("Sorted: " + list.stream().min(OffsetDateTime::compareTo));


            // Compare both
            System.out.println("On coparing we get " + date1.compareTo(date2));
        }


}
