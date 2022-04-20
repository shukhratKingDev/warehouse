package com.company.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;
    @Column(nullable=false)
    private long amount;
    @Column(nullable=false)
    private double price;
    @Column(nullable=false)
    private Timestamp expireDate;
    @ManyToOne(cascade = CascadeType.ALL)
    private Input input;

}
