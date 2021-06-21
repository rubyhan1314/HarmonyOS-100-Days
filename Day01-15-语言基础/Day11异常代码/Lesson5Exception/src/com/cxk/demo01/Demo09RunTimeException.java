package com.cxk.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo09RunTimeException {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(Collections.nCopies(100, "Ramesh"));
        processData(data);
    }
 
    public static void processData(List<String> data){
        if(data.size() > 50){
             throw new BaseRuntimeException("Image file size con't exceed :: " + 10000000);
        }
    }
}

class BaseRuntimeException extends RuntimeException {
	  
    private static final long serialVersionUID = 1L;

    private int statusCode = 500;

    public BaseRuntimeException() {
        super();
    }

    public BaseRuntimeException(String message) {
        super(message);
    }


    public BaseRuntimeException(Throwable t) {
        super(t.getMessage(),t);
    }

    public BaseRuntimeException(String message, Throwable t) {
        super(message, t);
    }

    public BaseRuntimeException(int status, String message, Throwable t) {
        super(message, t);
        this.statusCode = status;
    }

    public BaseRuntimeException(String message, Throwable t,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, t, enableSuppression, writableStackTrace);
    }

    public int getStatusCode() {
        return statusCode;
    }
}