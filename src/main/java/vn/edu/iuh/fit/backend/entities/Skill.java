package vn.edu.iuh.fit.backend.entities;


import lombok.*;
import vn.edu.iuh.fit.backend.enums.SkillType;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Skill {
    private UUID id;
    private String description;
    private String name;
    private SkillType type;

    public Skill(UUID id) {
        this.id = id;
    }


}
