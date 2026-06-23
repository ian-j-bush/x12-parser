package com.ianjbush.x12parser.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Component which enables dynamic switching between rendering modes.
 */
@Component
public class RenderServiceRegistry {

    private final Map<String, RenderService> services;

    public RenderServiceRegistry( List<RenderService> services ) {
        this.services = services.stream( ).collect( Collectors.toMap( RenderService::getType, service -> service ) );
    }

    public RenderService getService( String type ) {
        RenderService service = services.get( type );
        if ( service == null ) {
            throw new IllegalArgumentException( "Unknown rendering type: " + type );
        }
        return service;
    }

    public Set<String> getAvailableTypes( ) {
        return services.keySet( );
    }
}
