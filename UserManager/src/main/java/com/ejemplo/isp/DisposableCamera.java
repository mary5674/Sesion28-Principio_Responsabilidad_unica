package com.ejemplo.isp;

class DisposableCamera implements Powerable {
    @Override
    public void turnOn() { 
        System.out.println("Disposable camera is turning on.");
    }
    @Override
    public void turnOff() { 
        System.out.println("Disposable camera is turning off.");
    }
}