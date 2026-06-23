package com.ianjbush.x12parser.service;

import org.springframework.web.bind.annotation.PostMapping;

public interface RenderService {

    @PostMapping
    public Object render( String body );

    /**
     * Used to identify Bean and allow for sle
     * @return
     */
    public String getType();
}
