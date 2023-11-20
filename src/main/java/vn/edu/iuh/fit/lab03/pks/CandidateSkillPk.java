package vn.edu.iuh.fit.lab03.pks;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.lab03.models.Candidate;
import vn.edu.iuh.fit.lab03.models.Skill;

import java.io.Serializable;

@Getter
@Setter
public class CandidateSkillPk implements Serializable {
    private Skill skill;
    private Candidate candidate;
}
