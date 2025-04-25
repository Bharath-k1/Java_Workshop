package com.xworkz.meatup.controller;

import com.xworkz.meatup.configuration.MeetupWebinit;
import com.xworkz.meatup.dto.MeetupDeatailsDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/")
@Controller
public class MeetupController {
    public MeetupController(){
        System.out.println("MeetupController created");
    }

    //get and post methods
    @PostMapping("/submit")
    public String acceptPostMethod(@ModelAttribute MeetupDeatailsDto dto){
        System.out.println("acceptPostMethod() invoked");
        dto.setCreatedBy("your name:");
        dto.setCreatedOn(LocalDateTime.now());
        System.out.println(("Data is:"+dto));
        //save data into the database
        public void saveMeetup(MeetupDeatailsDto dto) {
            MeetupEntity entity = new MeetupEntity();
            entity.setPlace(dto.getPlace());
            entity.setDate(dto.getDate());
            entity.setTime(dto.getTime());
            entity.setMeetPerson(dto.getMeetPerson());
            entity.setGift(dto.getGift());
            entity.setCreatedBy(dto.getCreatedBy());
            entity.setCreatedOn(dto.getCreatedOn());
            repo.saveMovie(entity);


            return "success.jsp";
    }
    @GetMapping
    public String acceptgetmethod(){
        System.out.println("acceptgetMethod() invoked");
        return "success.jsp";

    }
}
