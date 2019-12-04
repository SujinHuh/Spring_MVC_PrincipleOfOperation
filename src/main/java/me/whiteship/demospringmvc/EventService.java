package me.whiteship.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event eventOne = Event.builder().name("스프링 웹 MVC 스터디 1차").limitOfEntollment(5)
                .startDateTime(LocalDateTime.of(2019,12,04,10,0))
                .endDateTime(LocalDateTime.of(2019,12,04,13,0))
                .build();

        Event eventTwo = Event.builder().name("스프링 웹 MVC 스터디 2차").limitOfEntollment(5)
                .startDateTime(LocalDateTime.of(2019,12,20,11,0))
                .endDateTime(LocalDateTime.of(2019,12,04,13,0))
                .build();

        return List.of(eventOne,eventTwo);
    }
}
