package com.neowiz.domain;

/**
 * 전등에 대한 receiver 객체.
 */
public class Light {

    public Light() { }

    public Light(String str) {

    }

    public void on() {
        System.out.println("Light is on !");
    }

    public void off() {
        System.out.println("Light is off !");
    }
}
