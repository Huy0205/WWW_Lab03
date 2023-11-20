package vn.edu.iuh.fit.lab03.pks;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.lab03.models.Skill;
import vn.edu.iuh.fit.lab03.models.Job;

import java.io.Serializable;

@Getter
@Setter
public class JobSkillPk implements Serializable {
    private Job job;
    private Skill skill;
}
