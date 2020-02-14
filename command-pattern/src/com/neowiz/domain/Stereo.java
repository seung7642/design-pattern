package com.neowiz.domain;

/**
 * 스테레오(음악 재생 장비)에 대한 receiver 객체.
 */
public class Stereo {

    private int volume;

    public void on() {
        System.out.println("Stereo is on !");
    }

    public void off() {
        System.out.println("Stereo is off !");
    }

    public void setCd() {

    }

    public void setDvd() {

    }

    public void setRadio() {

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
