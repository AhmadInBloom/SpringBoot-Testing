//package dev.learningtesting.Product;
//
//import dev.learningtesting.User.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/user/")
//public class ProductController {
//    @Autowired
//    ProductService productService;
//
//    @GetMapping
//    public ResponseEntity<?> getAllProducts(){
//        return  productService.getAllUsers();
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<?> getUser(@PathVariable Long id){
//        return productService.getUserById(id);
//    }
//    @PostMapping
//    public ResponseEntity<?> addUser(@RequestBody User user){
//        return productService.addUser(user);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<?> removeUser(@PathVariable long id){
//        return productService.removeUserById(id);
//    }
//
//    /*
//     update is not needed for now.
//     */
//
//}
