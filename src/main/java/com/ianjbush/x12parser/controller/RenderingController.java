package com.ianjbush.x12parser.controller;

import com.ianjbush.x12parser.service.RenderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/render")
public class RenderingController {

    private final RenderService service;

    public RenderingController( RenderService service ) {
        this.service = service;
    }

    @PostMapping("/{id}/{mode}")
    public Object renderClaimData( @PathVariable String id, @PathVariable String mode ) {
        service.render();

        return "ID: " + id + ", Mode: " + mode;
    }
}
