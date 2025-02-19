package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennsCoach implements Coach{

    public TennsCoach(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
