package com.bsoftgroup.springcloudmsconsulta.integration;

import com.bsoftgroup.springcloudmsconsulta.business.GreetingServiceInterface;
import com.bsoftgroup.springcloudmsconsulta.dto.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class GreetingRestController {

    @Autowired
    private GreetingServiceInterface service;

    @GetMapping(path = "/rest/hello")
    public Flux<Greeting> hello(){
        return Flux.just(service.hello());
    }

}
