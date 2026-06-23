package com.ianjbush.x12parser.controller;

import com.ianjbush.x12parser.service.RenderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/api/render" )
public class RenderingController {

    private RenderService service;

    public RenderingController( RenderService service ) {
        this.service = service;
    }

    public void setService( RenderService service ) {
        this.service = service;
    }

    @PostMapping( "/{id}/{mode}" )
    public Object renderClaimData( @PathVariable String id, @PathVariable String mode, @RequestBody String raw ) {
        if ( mode.equalsIgnoreCase( "image" ) || mode.equalsIgnoreCase( "list" ) ) {
            return "Under Construction";
        }

        return service.render( raw );
    }
}
