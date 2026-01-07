package com.system_design.solid.srp.solution;

public class UserService {
    public void createUser(String name){
        System.out.println("user create");
    }

    public static void main(String[] args) {
        UserService userService =new UserService();
        UserRepository userRepository = new UserRepository();
        UserValidator userValidator = new UserValidator();

        userValidator.validateUser("JOHN");
        userService.createUser("JOHN");
        userRepository.saveUser("JOHN");




    }
}
