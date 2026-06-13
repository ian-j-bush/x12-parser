package com.ianjbush.x12parser.controller;

import com.ianjbush.x12parser.service.ClaimService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping( "/api/claim" )
public class ClaimController {

    private final ClaimService service;

    public ClaimController( ClaimService service ) {
        this.service = service;
    }

    @GetMapping( value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE )
    public Object retrieveClaimData( @PathVariable String id ) {

        return "ID: " + id;
    }
}
