//package dev.learningtesting.User;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
////@SpringBootTest
////@DataJpaTest
////@AutoConfigureMockMvc
//public class DemoControllerTest
//{
//
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void testSaveBook() throws Exception {
//        String requestBody = "{\"title\":\"Spring Boot in Action\",\"author\":\"Craig Walls\"}";
//
//        MvcResult result = mockMvc.perform(post("/books")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(requestBody))
//                .andExpect(status().isCreated())
//                .andReturn();
//
//        String response = result.getResponse().getContentAsString();
//        Book savedBook = new ObjectMapper().readValue(response, Book.class);
//
//        assertNotNull(savedBook.getId());
//    }
//
//    @Test
//    public void testGetBookById() throws Exception {
//        Book book = new Book();
//        book.setTitle("Clean Code");
//        book.setAuthor("Robert C. Martin");
//
//        entityManager.persist(book);
//
//        mockMvc.perform(get("/books/{id}", book.getId()))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.title").value("Clean Code"))
//                .andExpect(jsonPath("$.author").value("Robert C. Martin"));
//    }
//
//    @Test
//    public void testGetAllBooks() throws Exception {
//        Book book1 = new Book();
//        book1.setTitle( "Design Patterns" );
//        book1.setAuthor( "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides" );
//
//        Book book2 = new Book();
//        book2.setTitle( "Effective Java" );
//    }}