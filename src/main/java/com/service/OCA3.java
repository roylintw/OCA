package com.service;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class OCA3 {

    public static void main(String[] args) {
        String date = LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME);
//                .format(DateTimeFormatter.ISO_DATE); // 如果要正確印出日期，使用 ISO_DATE 格式，印出 2014-05-04
        System.out.println(date);
    }

    // 如果要印出時間格式，使用 ZonedDateTime、OffsetDateTime
//    public static void main(String[] args) {
//        String date = ZonedDateTime
//                .parse("2024-05-04T15:23:01.123Z")
//                .format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println(date);
//    }

}
