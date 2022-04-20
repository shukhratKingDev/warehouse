package com.company.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable=false)
    private String firstName;
    private String lastName;
    @Column(nullable=false,unique = true)
    private String phoneNumber;
    @Column(nullable=false,unique = true)
    private String code;
    @Column(nullable=false)
    private String password;
    private boolean active;
    @ManyToMany
    private List<Warehouse> warehouse;
}
