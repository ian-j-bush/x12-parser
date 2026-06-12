package com.ianjbush.x12parser.controller;

import com.ianjbush.x12parser.service.ClaimService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {
    
    private final ClaimService service;

    public ClaimController( ClaimService service ) {
        this.service = service;
    }

    @PostMapping( "/{id}" )
    public String post( @RequestBody String value ) {
        return "index";
    }
}
