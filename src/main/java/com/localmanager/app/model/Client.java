package com.localmanager.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private Long id;
    private String name;
    private String phone1;
    private String phone2;
    private String neighborhood;
    private String street;
    private String number;
    private String landmark;

    List<Order> orderList = new ArrayList<>();

    public Client() {}

    public Client(String name, String phone1, String phone2, String neighborhood, String street, String number, String landmark) {
        this.name = name;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.landmark = landmark;
    }

    public Client(String name, String phone1, String neighborhood, String street, String number, String landmark) {
        this.name = name;
        this.phone1 = phone1;
        this.phone2 = null;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.landmark = landmark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(name, client.name) && Objects.equals(phone1, client.phone1) && Objects.equals(phone2, client.phone2) && Objects.equals(neighborhood, client.neighborhood) && Objects.equals(street, client.street) && Objects.equals(number, client.number) && Objects.equals(landmark, client.landmark) && Objects.equals(orderList, client.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone1, phone2, neighborhood, street, number, landmark, orderList);
    }
}
