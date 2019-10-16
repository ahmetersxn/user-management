package com.ahmetersin.usermanagement.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraints.Size;
import java.io.Serializable;


@Document(collection= "user")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class User implements Serializable {


    @Size(min = 4, max = 255, message = "Minimum username length: min :4 max : 255 characters")
    private String username;

    @Size(min = 5, max = 50 ,message = "Mail number length: min :5 max : 10 characters")
    private String email;

    @Size(min = 12, max = 12 ,message = "Phone number length: 10 characters")
    private String phonenumber;

}
