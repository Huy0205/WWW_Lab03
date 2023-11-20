package vn.edu.iuh.fit.lab03.models;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Job {
    private UUID id;
    private String name;
    private String description;
    private Company company;
}
