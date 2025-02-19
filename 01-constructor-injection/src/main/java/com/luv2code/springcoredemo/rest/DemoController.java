package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for dependency
    private Coach myCoach;
    /*
    //setter injection example
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }*/

    //define a constructor for a dependency injection
    //constructor injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach){
        System.out.println("In constructor " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

   /* @GetMapping("/check")
    public String check(){
        return "comparing beans: myCoach == another coach, " + (myCoach == anotherCoach);
    }*/
}
