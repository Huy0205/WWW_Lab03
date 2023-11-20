package vn.edu.iuh.fit.lab03.models;

import lombok.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Candidate {
    private UUID id;
    private LocalDate dob;
    private String fullName;
    private String email;
    private String phone;
    private Address address;
}
