package dev.learningtesting.User;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith( MockitoExtension.class)
class UserServiceImpTest {

    @Mock
    UserRepository userRepository;

   @InjectMocks
    UserServiceImp userServiceImp;

    @BeforeEach
    void setUp() {
        userServiceImp = new UserServiceImp( userRepository );
    }

//
//    @AfterEach
//    void tearDown() throws Exception {
//    }

    @Test
    void getAllUsers() {
        // when this call happens
        userServiceImp.getAllUsers();
        // check if this call "findAll()" has been called?
        verify(userRepository).findAll();
        // if this verify function returns true then the test is True, else the test is False
    }

    @Test
    void canAddUser() {
    }

    @Test
    @Disabled
    void getUserById() {
    }

    @Test
    @Disabled
    void removeUserById() {
    }
}