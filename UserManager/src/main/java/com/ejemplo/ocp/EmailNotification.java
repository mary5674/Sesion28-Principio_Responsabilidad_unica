package com.ejemplo.ocp;

public class EmailNotification implements Notification {
    public void  send(String message) {
	     System.out.println("Sending Email: " + message);
    }
}