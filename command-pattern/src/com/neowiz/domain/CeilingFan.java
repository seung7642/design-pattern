package com.neowiz.domain;

/**
 * 천장 선풍기에 대한 receiver 객체.
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    /**
     * 선풍기 속도를 HIGH로 맞춘다.
     */
    public void high() {
        speed = HIGH;
    }

    /**
     * 선풍기 속도를 MEDIUM으로 맞춘다.
     */
    public void medium() {
        speed = MEDIUM;
    }

    /**
     * 선풍기 속도를 LOW로 맞춘다.
     */
    public void low() {
        speed = LOW;
    }

    /**
     * 선풍기를 끈다.
     */
    public void off() {
        speed = OFF;
    }

    /**
     * 선풍기 속도를 구한다.
     *
     * @return
     */
    public int getSpeed() {
        return speed;
    }
}
