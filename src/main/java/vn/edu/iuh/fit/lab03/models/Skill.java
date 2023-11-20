package vn.edu.iuh.fit.lab03.models;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Skill {
    private UUID id;
    private String description;
    private String name;
    private byte type;
}
