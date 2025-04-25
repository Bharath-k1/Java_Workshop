package com.xworkz.Passportapp.Runner;

import com.xworkz.Passportapp.dto.PassportAppDetailsDto;

import java.time.LocalDate;

public class PassportAppRunner {
    public static void main(String[] args) {
        PassportAppDetailsDto dto =new PassportAppDetailsDto();
        dto.setPassportId(2);
        dto.setContactNumber(12345567);
        dto.setName("Bharath");
        dto.setEmailId("Bharath@gamil.com");
        dto.setPassportexpDate(LocalDate.now());
        dto.setNationality("hindu");
        dto.setAddarNumber(98765432);
        System.out.println(dto.getPassportId());
        System.out.println(dto.getContactNumber());
        System.out.println(dto.getName());
        System.out.println(dto.getEmailId());
        System.out.println(dto.getPassportexpDate());
        System.out.println(dto.getNationality());
        System.out.println(dto.getAddarNumber());


    }
}
