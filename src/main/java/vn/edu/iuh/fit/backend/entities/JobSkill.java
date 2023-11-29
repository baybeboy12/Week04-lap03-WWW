package vn.edu.iuh.fit.backend.entities;


import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillLevel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JobSkill {
    private String moreInfos;
    private SkillLevel skillLevel;
    private Job job;
    private Skill skill;
}
