package vn.edu.iuh.fit.lab03.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CandidateSkill {
    private Skill skill;
    private Candidate candidate;
    private String moreInfos;
    private byte skillLevel;
}
