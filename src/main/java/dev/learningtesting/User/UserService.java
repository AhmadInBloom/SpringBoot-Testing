package dev.learningtesting.User;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface UserService{
    ResponseEntity<?> getAllUsers();
     ResponseEntity<?> addUser(User user);

     ResponseEntity<String> getUserById(long id);

    ResponseEntity<?> removeUserById(long id);
}
