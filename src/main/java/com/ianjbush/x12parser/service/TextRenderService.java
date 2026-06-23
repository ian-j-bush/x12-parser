package com.ianjbush.x12parser.service;

import org.springframework.stereotype.Service;

@Service
public class TextRenderService implements RenderService {

    /**
     * Takes in raw X12 EDI data and returns it as a String.
     *
     * While redundant, this configuration maintains consistency with the other service modes.
     *
     * @param body
     * @return
     */
    @Override
    public Object render( String body ) {
        return body;
    }

    @Override
    public String getType( ) {
        return "raw";
    }
}
