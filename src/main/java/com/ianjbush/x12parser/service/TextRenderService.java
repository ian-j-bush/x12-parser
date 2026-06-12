package com.ianjbush.x12parser.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TextRenderService implements RenderService {

    @Override
    public Object render( ) {
        //TODO: Render the EDI in raw text
        return null;
    }
}
