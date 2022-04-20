package com.company.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Output {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable=false)
    private Timestamp date;
    @ManyToOne(cascade = CascadeType.ALL)
    private Warehouse warehouse;
    @ManyToOne(cascade = CascadeType.ALL)
    private Currency currency;
    @Column(nullable=false)
    private String factureNumber;
    @Column(nullable=false,unique = true)
    private String code;
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;
}
