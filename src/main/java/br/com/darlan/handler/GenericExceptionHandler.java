package br.com.darlan.handler;

import br.com.darlan.dto.ErrorDTO;
import br.com.darlan.exception.GenericException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GenericExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    @ExceptionHandler(GenericException.class)
    public ErrorDTO handler(GenericException ex) {
        return new ErrorDTO(
                ex.getMessage(),
                ex.getCep()
        );
    }
}
