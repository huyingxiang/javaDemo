package com.springDemo.test;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huyingxiang on 17/2/21.
 */
@Configuration
public class Beans {
    @Bean(name = "car")
    public Car buildCar(){
        Car car = new Car();
        car.setBrand("BMW");
        car.setColor("black");
        return car;
    }
}
