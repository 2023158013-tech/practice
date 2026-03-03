package com.jeongrim.practice.oop;


public class SmartPhone {
    private Camera camera = new Camera();

    public void isOn() {
        camera.turnOn();
    }

    public void cameraOn() {
        camera.cameraOn();
    }

    public void photo() {
        camera.photo();
    }

    public void video() {
        camera.video();
    }

    public void isOff() {
        camera.turnOff();
    }
}
