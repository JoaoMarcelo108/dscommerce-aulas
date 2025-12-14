package com.devsuperior.dscommerce.dto;

import java.time.Instant;

public class CustomError {

    private Instant timestamp;
    private int status;
    private String error;
    private String path;

    public CustomError(Instant timestamp, int status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }
}
