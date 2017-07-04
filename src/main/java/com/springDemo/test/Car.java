package com.springDemo.test;

/**
 * Created by huyingxiang on 17/2/21.
 */
public class Car {
    private String color;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info(){
        System.out.println("color:"+color+" brand:"+brand);
    }
}
