package me.whiteship.demospringmvc;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {

    private String name;

    private int limitOfEntollment;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;


}
