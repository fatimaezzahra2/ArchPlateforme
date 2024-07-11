package org.emsi.platformarch.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Userr {
    @Id @GeneratedValue()
    private Long id;
    private String name;
    private String mail;
    @OneToMany(mappedBy = "userr")
    private List<Project> projects;

}
