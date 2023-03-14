package com.example.springbootmaven.Controller;

import com.example.springbootmaven.BaseResponse.ResponseBase;
import com.example.springbootmaven.Models.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot";
    }

//    @PostMapping("/addUser")
//    public ResponseBase addNewUsers(@RequestBody UserModel user){
//        ResponseBase responseBase = new ResponseBase();
//        if(user.userName == null && user.mobileNumber == null && user.email == null){
//            responseBase.statusCode = -1;
//            responseBase.statusMessage = "User entries are empty";
//           // return new HttpResponse<>(responseBase, HttpStatus.BAD_REQUEST);
//        }else{
//            responseBase.statusCode = 1;
//            responseBase.statusMessage = "Success";
//        }
//        return new ResponseEntity<>(responseBase, HttpStatus.CREATED);
//    }

}
