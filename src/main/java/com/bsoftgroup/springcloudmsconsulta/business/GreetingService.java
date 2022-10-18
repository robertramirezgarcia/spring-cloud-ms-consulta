package com.bsoftgroup.springcloudmsconsulta.business;

import com.bsoftgroup.springcloudmsconsulta.dto.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements GreetingServiceInterface{
    @Override
    public Greeting hello() {
        return new Greeting("Hello spring!");
    }
}