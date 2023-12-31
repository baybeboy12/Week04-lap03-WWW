package vn.edu.iuh.fit.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CandidateSkillID {
    private Skill skill;
    private Candidate candidate;
}
