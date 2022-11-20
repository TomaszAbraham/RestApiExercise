package pl.training.restapi.services;

import org.springframework.core.convert.converter.Converter;

import pl.training.restapi.exception.WrongOperationException;

public class StringToEnumConverter implements Converter<String, Operations> {

    @Override
    public Operations convert(String source) {
        try {
            return Operations.valueOf(source.toUpperCase());
        }catch (IllegalArgumentException e) {
            throw new WrongOperationException(source);
        }
        
    }

}
