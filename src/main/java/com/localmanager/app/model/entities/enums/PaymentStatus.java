package com.localmanager.app.model.entities.enums;

public enum PaymentStatus {
    PAID_OUT(1),
    PENDING(2);

    private int code;

    private PaymentStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static PaymentStatus valueOf(int code) throws IllegalAccessException {
        for(PaymentStatus value : PaymentStatus.values()) {
            if(value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalAccessException("Código de pagamento inválido.");
    }
}
