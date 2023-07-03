package dev.learningtesting.User;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepositoryTest;
    User ahmad = new User(
            "Ahmad",
            "ahmadPass",
            "USER"
    );
    @BeforeEach
    void setUp() {

        userRepositoryTest.save(ahmad);
    }

    @AfterEach
    void tearDown() {
        userRepositoryTest.deleteAll();
    }

    @Test
    void itShouldFindUserByPassword() {
        //given

        //when
        User returnedValue = userRepositoryTest.findByPassword( ahmad.password );


        //then

        assertEquals( returnedValue,ahmad );

    }
    @Test
    void itShouldNotFindUserByPassword() {
        //given

        //when
        User returnedValue = userRepositoryTest.findByPassword( "NotAhmadPass" );


        //then

        assertNull( returnedValue );

    }

}
