package com.xworkz.gymapp.runner;

import com.xworkz.gymapp.constant.MemberShipType;
import com.xworkz.gymapp.dto.*;
import com.xworkz.gymapp.repository.GymMemberShipRepository;
import com.xworkz.gymapp.repository.GymMemberShipRepositoryImpl;
import com.xworkz.gymapp.service.GymMemberShipService;
import com.xworkz.gymapp.service.GymMemberShipServiceImplementation;

import java.time.LocalDate;
import java.time.LocalTime;

public class GymMemberShipRunner {
    public static void main(String[] args) {
        GymMembershipDetailsDto dto = new GymMembershipDetailsDto();
        dto.setMemberId(1);
        dto.setContactNumber(12345567);
        dto.setMemberName("Bharath");
        dto.setMemberEmailId("Bharath@gamil.com");
        dto.setMemberShipType(MemberShipType.DAILY);
        dto.setIssuedDate(LocalDate.now());
        dto.setIssuedTime(LocalTime.now());
        dto.setExpDate(LocalDate.ofYearDay(2026,12));
        System.out.println(dto.getExpDate());
        System.out.println(dto.getIssuedDate());
        System.out.println(dto.getIssuedTime());
        System.out.println(dto.getMemberShipType());
        System.out.println(dto.getMemberId());
        System.out.println(dto.getContactNumber());
        System.out.println(dto.getMemberName());
        System.out.println((dto.getMemberEmailId()));
        //create a instance for the repository
        GymMemberShipRepository gymMemberShipRepository = new GymMemberShipRepositoryImpl();
        //create a object //upcasting
        GymMemberShipService service = new GymMemberShipServiceImplementation(gymMemberShipRepository);
        service.validateDto(dto);
        service.validateDto(dto);

        System.out.println("===== read method =====");
        service.readDto();


    }
}

