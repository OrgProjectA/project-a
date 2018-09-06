package com.cicd.projecta;


import com.cicd.projecta.repository.PivotalTrackerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
