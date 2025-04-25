package com.xworkz.Passportapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter

public class PassportAppDetailsDto {
    private int passportId;
    private String Name;
    private String EmailId;
    private long contactNumber;
    private LocalDate passportexpDate;
    private String nationality;
    private long AddarNumber;
}
