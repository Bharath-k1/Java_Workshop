package com.xworkz.meatup.repo;

import com.xworkz.meatup.dto.MeetupDeatailsDto;

public interface MeetRepo {
    void savemeet(MeetupDeatailsDto dto);
    void readmeet();
}
