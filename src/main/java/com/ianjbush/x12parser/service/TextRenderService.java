package com.ianjbush.x12parser.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class TextRenderService implements RenderService {

    @Override
    public Object render( String body ) {
        return body;
    }

    @Override
    public String getType( ) {
        return "raw";
    }
}
