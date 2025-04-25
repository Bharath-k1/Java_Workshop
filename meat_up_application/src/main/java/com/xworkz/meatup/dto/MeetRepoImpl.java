package com.xworkz.meatup.dto;

import com.xworkz.meatup.repo.MeetRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.Class.forName;

public abstract class MeetRepoImpl implements MeetRepo {
    @Override
    public void savemeet(MeetupDeatailsDto dto){
        String urls="";
        String username="root";
        String psw="Bkms@8088";

        String query=""
         try{
           class.forName("");
             Connection connection = DriverManager(urls,username,psw);
             PreparedStatement Statement = connection.prepareStatement(query);

         }
    }

}
