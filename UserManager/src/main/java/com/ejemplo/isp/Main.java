package com.ejemplo.isp;

import com.ejemplo.isp.Phone;
import com.ejemplo.isp.DisposableCamera;

public class Main 
{
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.turnOn();
        phone.charge();
        phone.turnOff();

        DisposableCamera camera = new DisposableCamera();
        camera.turnOn();
        camera.turnOff();
    }
}