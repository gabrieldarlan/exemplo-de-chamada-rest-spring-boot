package br.com.darlan.dto;

public class ErrorDTO {
    private String message;
    private String cep;

    public ErrorDTO(String message, String cep) {
        this.message = message;
        this.cep = cep;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
