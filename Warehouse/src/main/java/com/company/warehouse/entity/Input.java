package com.company.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Input {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable=false)
    private Timestamp date;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id")
    private List<Currency> currency;
    @OneToMany(cascade = CascadeType.ALL,mappedBy ="id")
    private List<Supplier> suppliers;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id")
    private List<Warehouse> warehouse;
    @Column(nullable=false)
    private Integer factureNumber;
    @Column(nullable=false,unique = true)
    private String code;
}
