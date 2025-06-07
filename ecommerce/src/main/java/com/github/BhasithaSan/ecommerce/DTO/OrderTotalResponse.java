package com.github.BhasithaSan.ecommerce.DTO;

public class OrderTotalResponse {
    private Float total;
    private int status;
    private String message;

    public OrderTotalResponse(Float total, int status, String message) {
        this.total = total;
        this.status = status;
        this.message = message;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

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
}