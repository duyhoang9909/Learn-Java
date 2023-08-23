package com.javacore.Ycollection.domain;

import java.util.Objects;

public class Smartphone {

    private String serialNumber;
    private String name;

    public Smartphone(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;

        Smartphone otherSmartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(otherSmartphone.serialNumber) &&
                name != null && name.equals(otherSmartphone.name);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
