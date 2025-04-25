package com.xworkz.meatup.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Getter
@Setter
@ToString
public class MeetupDeatailsDto {

    private String Place;
    private String Date;
    private String time;
    private String meetPerson;
    private String gift;
    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime updatedOn;
    private String updatedBy;

}
