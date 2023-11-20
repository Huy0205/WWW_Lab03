package vn.edu.iuh.fit.lab03.models;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company {
    private UUID id;
    private String about;
    private String email;
    private String name;
    private String webURL;
    private Address address;
}
