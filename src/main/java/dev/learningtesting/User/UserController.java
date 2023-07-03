package dev.learningtesting.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class UserController{
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<?> getAllUsers(){
        return  userService.getAllUsers();
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping
    public ResponseEntity<?> removeUser(@PathVariable long id){
        return userService.removeUserById(id);
    }

    /*
     update is not needed for now.
     */

}
