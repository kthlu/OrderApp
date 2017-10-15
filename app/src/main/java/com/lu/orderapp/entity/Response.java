package com.lu.orderapp.entity;

import java.io.Serializable;

/**
 * Created by lu on 10/15/17.
 */

public class Response implements Serializable {
    private static final long serialVersionUID = -2919650006018695038L;
    public int status;
    public String message;
    public Object response;

    public Response(){}
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", response=" + response +
                '}';
    }
}
