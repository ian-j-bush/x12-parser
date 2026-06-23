package com.ianjbush.x12parser.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Service
public class ClaimService {

    public String retrieveClaim( String id ) {
        try {
            InputStream stream = new ClassPathResource( "/static/samples/" + ClaimCodes.getByCode( id ).getFilePrefix( ) + "_claim_837.edi" ).getInputStream( );
            return new String( stream.readAllBytes( ), StandardCharsets.UTF_8 );
        } catch ( IOException e ) {
            e.printStackTrace( );
        }
        return null;
    }

    private enum ClaimCodes {
        PROF( "prof", "x222_professional" ),
        INST( "inst", "x223_institutional" ),
        DENT( "dent", "x224_dental" );

        private final String code;
        private final String filePrefix;

        ClaimCodes( String code, String filePrefix ) {
            this.code = code;
            this.filePrefix = filePrefix;
        }

        public String getCode( ) {
            return code;
        }

        public String getFilePrefix( ) {
            return filePrefix;
        }

        public static ClaimCodes getByCode( String code ) {
            return Arrays.stream( ClaimCodes.values( ) ).filter( codes -> codes.getCode( ).equalsIgnoreCase( code ) ).findAny( ).orElseThrow( );
        }
    }
}
