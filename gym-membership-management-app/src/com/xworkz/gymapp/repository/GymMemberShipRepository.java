package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

public interface GymMemberShipRepository {
    boolean saveDto(GymMembershipDetailsDto dto);
    void readDto();
}
