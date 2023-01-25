package com.zzf.exception;

public class SyetemException extends RuntimeException{

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public SyetemException(int code, String message) {
        super(message);
        this.code = code;
    }

    public SyetemException(int code, String message, Throwable cause ) {
        super(message, cause);
        this.code = code;
    }




}
