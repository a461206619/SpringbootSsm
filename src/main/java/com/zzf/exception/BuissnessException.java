package com.zzf.exception;

public class BuissnessException extends RuntimeException{

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public BuissnessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BuissnessException(int code, String message, Throwable cause ) {
        super(message, cause);
        this.code = code;
    }




}
