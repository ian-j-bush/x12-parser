package com.ianjbush.x12parser.service;

import org.springframework.web.bind.annotation.PostMapping;

public interface RenderService {

    @PostMapping
    public Object render( String body );
}
