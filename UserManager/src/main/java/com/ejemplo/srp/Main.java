package com.ejemplo.srp;

import com.ejemplo.srp.UserManager;
import com.ejemplo.srp.UserValidator;
import com.ejemplo.srp.UserRepository;
import com.ejemplo.srp.NotificationService;

public class Main 
{
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        UserRepository repository = new UserRepository();
        NotificationService notificationService = new NotificationService();

        UserManager userManager = new UserManager(validator, repository, notificationService);

        userManager.addUser("example@domain.com", "password123"); 
        userManager.addUser("invalid-email", "1234");             
    }
}