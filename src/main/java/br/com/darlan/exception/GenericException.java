package br.com.darlan.exception;

public class GenericException extends RuntimeException {
    private String cep;

    public GenericException(String message, String cep) {
        super(message);
        this.cep = cep;
    }


    public String getCep() {
        return cep;
    }
}
