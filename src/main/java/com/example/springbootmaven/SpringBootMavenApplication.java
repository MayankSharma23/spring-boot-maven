package com.example.springbootmaven;

import com.example.springbootmaven.Models.UserModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootMavenApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMavenApplication.class, args);
	}

}
