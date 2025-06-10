package com.ejemplo.srp;

public class UserManager{
    private UserValidator validator;
    private UserRepository repository;
    private NotificationService notificationService;

    public UserManager(UserValidator validator, UserRepository repository, NotificationService notificationService) {
        this.validator = validator;
        this.repository = repository;
        this.notificationService = notificationService;
    }

    public void addUser(String email, String password) {
        if (validator.isValidEmail(email) && validator.isValidPassword(password)) {
            repository.save(email, password);
            notificationService.sendWelcomeEmail(email);
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}