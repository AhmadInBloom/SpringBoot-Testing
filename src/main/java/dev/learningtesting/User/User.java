package dev.learningtesting.User;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity( name = "usersTable" )
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class User{
 @Id
 @Column( nullable = false )
 long id;
 @Column( nullable = false, unique = true )
 String username;
 @Column( nullable = false )
 String password;
 String role;

 public User(String username, String password, String role) {
  this.username = username;
  this.password = password;
  this.role = role;
 }


}
