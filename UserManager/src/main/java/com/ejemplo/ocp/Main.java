package com.ejemplo.ocp;

import com.ejemplo.ocp.NotificationService;
import com.ejemplo.ocp.EmailNotification;
import com.ejemplo.ocp.SMSNotification;
import com.ejemplo.ocp.PushNotification;
public class Main 
{

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
 
        service.sendNotification(new EmailNotification(), "Hello via Email!");
        service.sendNotification(new SMSNotification(), "Hello via SMS!");
        service.sendNotification(new PushNotification(), "Hello via Push Notification!");
    }
}
