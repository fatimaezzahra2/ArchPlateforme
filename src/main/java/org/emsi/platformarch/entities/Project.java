package org.emsi.platformarch.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Project {
    @Id
    private String id;
    private String name;
    private String ville;
    private double latitude;
    private double longitude;
    private double cb;
    private double ne;
    private double np;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> system;
    @ManyToOne
    private Userr userr;
    //@JsonManagedReference // Indique à Jackson de gérer cette référence lors de la sérialisation JSON
    @JsonIgnore
    @ManyToMany(mappedBy = "projects",fetch = FetchType.EAGER)
    private List<Charges> charges=new ArrayList<>();
}
