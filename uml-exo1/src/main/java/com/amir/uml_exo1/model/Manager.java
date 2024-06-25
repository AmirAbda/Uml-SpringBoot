package com.amir.uml_exo1.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Manager extends WorkshopSupervisor {

    private String role;
    @OneToMany(mappedBy = "manager")
    private Set<Attendant> attendants;


    
}
