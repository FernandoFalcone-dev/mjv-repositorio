package com.fernando.cadastro.exceptions;

public class BusinessException extends RuntimeException {
    public BusinessException(String msg) {
        super(msg);
    }
    public BusinessException(String msg, Object ... params) {
        super(String.format(msg, params));
    }
}
