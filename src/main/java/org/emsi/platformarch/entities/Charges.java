package org.emsi.platformarch.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Charges {
    @Id
    private String id;
    private String name;
    private int quantity;
    private long puissance ;
    //private String heureMarche;
    private String heureMarche;
    private String heureArret;

   // @JsonBackReference // Indique à Jackson d'ignorer cette référence lors de la sérialisation JSON
   @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Project> projects=new ArrayList<>();
}
