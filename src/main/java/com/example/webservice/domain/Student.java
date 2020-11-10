package com.example.webservice.domain;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

//@Data
//@XmlRootElement
public class Student {
    private String name;
    private int standard;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
