package com.javastart.hellospring.controler.dto;

public class AccountRequestsDTO {

    private String name;
    private String email;
    private Integer bill;

    public AccountRequestsDTO(String name, String email, Integer bill) {
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public AccountRequestsDTO() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getBill() {
        return bill;
    }
}
