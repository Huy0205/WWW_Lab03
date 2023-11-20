package vn.edu.iuh.fit.lab03.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobSkill {
    private Job job;
    private Skill skill;
    private String moreInfos;
    private byte skillLevel;
}
