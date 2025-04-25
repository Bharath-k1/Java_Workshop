package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;
import com.xworkz.gymapp.repository.GymMemberShipRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
@AllArgsConstructor
public class GymMemberShipServiceImplementation implements GymMemberShipService{
    //here we need to create a instance of repo association
    private GymMemberShipRepository gymMemberShipRepository;
    @Override
    public boolean validateDto(GymMembershipDetailsDto dto){
        if(dto!=null){
            System.out.println("dto is not null we can save the data");
            boolean saveResult =gymMemberShipRepository.saveDto(dto);
            return saveResult;
        }
        return true;
    }
    @Override
    public void readDto(){
//        invoke the repository method
          this.gymMemberShipRepository.readDto();
//        System.out.println(Arrays.toString(listOfDtos));

    }
}
