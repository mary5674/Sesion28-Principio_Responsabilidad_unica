package com.ejemplo;
//primer ejercicio
// import com.ejemplo.srp.UserManager;
// import com.ejemplo.srp.UserValidator;
// import com.ejemplo.srp.UserRepository;
// import com.ejemplo.srp.NotificationService;

//segundo ejercicio
import com.ejemplo.ocp.NotificationService;
import com.ejemplo.ocp.EmailNotification;
import com.ejemplo.ocp.SMSNotification;
import com.ejemplo.ocp.PushNotification;
public class App 
{
    //Primer ejercicio
    // public static void main(String[] args) {
    //     UserValidator validator = new UserValidator();
    //     UserRepository repository = new UserRepository();
    //     NotificationService notificationService = new NotificationService();

    //     UserManager userManager = new UserManager(validator, repository, notificationService);

    //     userManager.addUser("example@domain.com", "password123"); 
    //     userManager.addUser("invalid-email", "1234");             
    // }

    //Segundo ejercicio
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
 
        service.sendNotification(new EmailNotification(), "Hello via Email!");
        service.sendNotification(new SMSNotification(), "Hello via SMS!");
        service.sendNotification(new PushNotification(), "Hello via Push Notification!");
    }
}
