package com.ahmetersin.usermanagement.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.Size;


@Document(collection= "user")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class User {

    @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
    private String username;

    private String email;

    @Size(min = 8, message = "Minimum password length: 8 characters")
    private String password;

    @Size(min = 10, max = 10 ,message = "Phone number length: 10 characters")
    private long phonenumber;

}
