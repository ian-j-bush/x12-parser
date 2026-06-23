package com.ianjbush.x12parser.controller;

import com.ianjbush.x12parser.service.RenderService;
import com.ianjbush.x12parser.service.RenderServiceRegistry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/api/render" )
public class RenderingController {

    private final RenderServiceRegistry serviceRegistry;

    public RenderingController( RenderServiceRegistry serviceRegistry ) {
        this.serviceRegistry = serviceRegistry;
    }

    @PostMapping( "/{id}/{mode}" )
    public Object renderClaimData( @PathVariable String id, @PathVariable String mode, @RequestBody String raw ) {
        RenderService service = serviceRegistry.getService( mode );

        return service.render( raw );
    }
}
