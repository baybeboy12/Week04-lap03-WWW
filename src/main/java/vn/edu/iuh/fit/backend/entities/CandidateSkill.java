package vn.edu.iuh.fit.backend.entities;


import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillLevel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CandidateSkill {
    private String moreInfos;
    private SkillLevel skillLevel;
    private Skill skill;
    private Candidate candidate;
}
