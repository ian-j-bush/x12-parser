package com.ianjbush.x12parser.controller;

import com.ianjbush.x12parser.service.ClaimService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {
    
    private final ClaimService service;

    public ClaimController( ClaimService service ) {
        this.service = service;
    }

    @GetMapping( "/{id}" )
    public String post( @RequestBody String value ) {
        return "index";
    }
}
