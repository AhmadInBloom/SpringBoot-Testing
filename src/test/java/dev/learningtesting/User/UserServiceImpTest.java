package dev.learningtesting.User;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;


class UserServiceImpTest {

    @Mock
    UserRepository userRepository;
   AutoCloseable autoCloseable;
    UserServiceImp userServiceImp;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks( this );
        userServiceImp = new UserServiceImp( userRepository );
    }

    @AfterEach
    void tearDown() throws Exception {
autoCloseable.close();
    }

    @Test
    void getAllUsers() {
        // when this call happens
        userServiceImp.getAllUsers();
        // check if this call "findAll()" has been called?
        verify(userRepository).findAll();
        // if this verify function returns true then the test is True, else the test is False
    }

    @Test
    @Disabled
    void addUser() {
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