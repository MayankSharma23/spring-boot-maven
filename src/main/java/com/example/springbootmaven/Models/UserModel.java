package com.example.springbootmaven.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;


public class UserModel {

    public String userId ;
    public String first_name;
    public String last_name;
    public String profile_image ;
    public String mobile_number;
    public String alternate_mobile_number;
    public String email_id ;
    public String gender;



}
