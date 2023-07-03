package dev.learningtesting.User;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {



    UserRepository userRepository;

    public ResponseEntity<?> getAllUsers() {
        if ( userRepository.findAll()
                .isEmpty() )
            return ResponseEntity.status( HttpStatus.NOT_FOUND )
                    .body( "no users added! " );
        return ResponseEntity.status( HttpStatus.OK )
                .body( userRepository.findAll() );
    }


    /**
     * if the user info is missing then return a bad request status
     * else add it
     */
    public ResponseEntity<String> addUser(User user) {
        try {
            userRepository.save( user );
            return ResponseEntity.status( HttpStatus.OK )
                    .body( "user added successfully" );
        } catch (Exception e) {
            return ResponseEntity.status( HttpStatus.BAD_REQUEST )
                    .body( "failed to add user" );
        }
    }
    /**
     * if the user id is missing then return a not found status
     * else return it
     */
    public ResponseEntity<String> getUserById(long id) {
        Optional<User> user = userRepository.findById( id );
        if ( user.isPresent() )
            return ResponseEntity.status( HttpStatus.FOUND )
                    .body( user.get().username);
        else return ResponseEntity.status( HttpStatus.NOT_FOUND )
                .body( "user not found" );
    }

    public ResponseEntity<?> removeUserById(long id) {
        Optional<User> user = userRepository.findById( id );
        if ( user.isPresent() ) {
            userRepository.deleteById( id );
            return ResponseEntity.status( HttpStatus.NO_CONTENT )
                    .body("user deleted successfully");
        }
        else return ResponseEntity.status( HttpStatus.NOT_FOUND)
                .body( "user not found" );
    }


}
