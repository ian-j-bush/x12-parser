package com.ianjbush.x12parser.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class ImageRenderService implements RenderService {

    @Override
    public Object render( String body ) {
        //TODO: Render the EDI as a claim image
        return "Image Render: Under Construction";
    }

    @Override
    public String getType() {
        return "image";
    }
}
