package com.alibou.security.Domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_tbl")
public class User {


    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String  lastname;
    private String email;
    private String password;
}
