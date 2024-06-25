package com.amir.uml_exo1.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Attendant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String name;

    private LocalDateTime shiftTiming ;
    @ManyToMany
    @JoinTable(
        name = "attendant_customer",
        joinColumns = @JoinColumn(name = "attendant_id"),
        inverseJoinColumns = @JoinColumn(name = "customer_id")
    )

    private Set<Customer> customers;
    @ManyToOne
    @JoinColumn(name= "manager_id")
    private Manager manager;
    
}
