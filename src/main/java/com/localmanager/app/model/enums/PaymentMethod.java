package com.localmanager.app.model.enums;

public enum PaymentMethod {
    DEBIT(1),
    CREDIT(2),
    PIX(3),
    CASH(4),
    PARTIAL(5),
    NONE(6);

    private int code;

    private PaymentMethod(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static PaymentMethod valueOf(int code) throws IllegalAccessException {
        for(PaymentMethod value : PaymentMethod.values()) {
            if(value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalAccessException("Método de pagamento não encontrado!");
    }
}
