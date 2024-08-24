package com.localmanager.app.model;

public class OrderItem {
    private Long id;
    private Order order;
    private Product product;

    private Integer quantity;
    private Double price;

    private Integer paymentMethod;
    private Integer paymentStatus;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity, Double price, PaymentMethod paymentMethod, PaymentStatus paymentStatus) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        setPaymentMethod(paymentMethod);
        setPaymentStatus(paymentStatus);
    }

    public OrderItem(Order order, Product product, Integer quantity, PaymentStatus paymentStatus) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        setPaymentStatus(paymentStatus);
        if(paymentStatus.getCode() == PaymentStatus.PENDING.getCode()) {
            paymentMethod = PaymentMethod.NONE.getCode();
        }
    }

    public Long getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PaymentMethod getPaymentMethod() throws IllegalAccessException {
        return PaymentMethod.valueOf(paymentMethod);
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        if(paymentMethod != null) {
            this.paymentMethod = paymentMethod.getCode();
        }
    }

    public PaymentStatus getPaymentStatus() throws IllegalAccessException {
        return PaymentStatus.valueOf(paymentStatus);
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        if(paymentStatus != null) {
            this.paymentStatus = paymentStatus.getCode();
        }
    }
}
