package com.groupeisi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class CalendarController {

    private final DateService dateService;

    public CalendarController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping("/services/calendar/dayfinder/{date}")
    public DayFinderResponse findDayOfWeek(@PathVariable String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate localDate = LocalDate.parse(date, formatter);

            DayOfWeek dayOfWeek = localDate.getDayOfWeek();


            dateService.saveDate(localDate);

            return new DayFinderResponse(localDate.toString(), dayOfWeek.toString());
        } catch (Exception e) {

            return null;
        }
    }
}
