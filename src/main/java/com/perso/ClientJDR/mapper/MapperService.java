package com.perso.ClientJDR.mapper;

import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Arrays;


@Service
public class MapperService {

    /***
     * This method map field on same DTO for partial update ( new and old DTO )
     * @param partial Partial DTO for mapping
     * @param <P>  Type of objects contained in the partial for the classDto
     * @return void
     */
    public <P> void patcherMapSecured(P destination , P partial) {
        Field[] partialFields=partial.getClass().getDeclaredFields();

        Arrays.stream(partialFields).forEach(field -> {
            //make access to the field
            field.setAccessible(true);

            //check value is not null
            Object value;
            try {
                value = field.get(partial);
                if(value != null){
                    field.set(destination, value);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } finally {
                //make field private
                field.setAccessible(false);
            }
        });
    }

}
