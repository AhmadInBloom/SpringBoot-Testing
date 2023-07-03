package dev.learningtesting.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(controllers = UserController.class)
class UserControllerTest {

    private MockMvc mockMvc;

    @MockBean
    private UserServiceImp userServiceImp;


    private TestRestTemplate testRestTemplate;

    private List<User> userList;



    /** This is integration testing : because it tests all the controller, service, and repos together.
    *
     */
//    @Test
//    public void testGetAllUsers() {
//
//
//        // Perform the request
//        ResponseEntity<List<User>> response = testRestTemplate.exchange(
//                "/api/user/",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<User>>() {}
//        );
//
//        // Verify the response
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        List<User> users = response.getBody();
//        assertNotNull(users);
//        assertEquals(2, users.size());
//        assertEquals("John",users.get( 0 ).getUsername());
//
//
//    }
    @Test
    void getUser() {
    }

    @Test
    void addUser() {
    }

    @Test
    void removeUser() {
    }

}