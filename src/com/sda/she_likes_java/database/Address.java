package com.sda.she_likes_java.database;

import java.util.Objects;

public class Address {
    private Long id;

    private String city;
    private String country;
    private String street;
    private String postalCode;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(getId(), address.getId()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getCountry(), address.getCountry()) && Objects.equals(getStreet(), address.getStreet()) && Objects.equals(getPostalCode(), address.getPostalCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCity(), getCountry(), getStreet(), getPostalCode());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address(Long id, String city, String country, String street, String postalCode) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.street = street;
        this.postalCode = postalCode;
    }
}
