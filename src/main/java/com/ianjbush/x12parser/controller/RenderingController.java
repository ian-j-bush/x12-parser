package com.ianjbush.x12parser.controller;

import com.ianjbush.x12parser.service.RenderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RenderingController {

    private final RenderService service;

    public RenderingController( RenderService service ) {
        this.service = service;
    }

    public void render() {
        service.render();
    }
}
