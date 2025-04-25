package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMembershipDetailsDto;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GymMemberShipRepositoryImpl implements GymMemberShipRepository {
    //declare the array
    private GymMembershipDetailsDto[] listOfDtos = new GymMembershipDetailsDto[2];
    private int index = 0;
    @Override
    public boolean saveDto(GymMembershipDetailsDto dto){
        System.out.println(("Invoking the GymmemnerShipRepositoryImp"));
        System.out.println("dto is:"+dto);
        if (this.index < listOfDtos.length) {

            listOfDtos[this.index]=dto;
            this.index++;

            System.out.println("saved sucessfully");
            return true;

        }else{
            System.out.println("check array length or array is full");
        }
        return true;
    }

    //write the logic to display
    @Override
    public void readDto(){
        System.out.println(Arrays.toString(listOfDtos));
    }
}
