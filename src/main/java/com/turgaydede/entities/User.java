package com.turgaydede.entities;

import com.turgaydede.business.annotations.UniqueUsername;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NotBlank
    @UniqueUsername
    @Column(name="user_name")
    private String userName;

    @NotBlank
    @Email
    @Column(name="email")
    private String email;

    @Size(min = 6,max = 20)
    @NotBlank
    @Column(name="password")
    private String password;
}
