package com.ianjbush.x12parser.controller;

import com.ianjbush.x12parser.service.ClaimService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/claim")
public class ClaimController {
    
    private final ClaimService service;

    public ClaimController( ClaimService service ) {
        this.service = service;
    }

    @GetMapping( value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE )
    public String post( @RequestBody String value ) {
        return "index";
    }
}
