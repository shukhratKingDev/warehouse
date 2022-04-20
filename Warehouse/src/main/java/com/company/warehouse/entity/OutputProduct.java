package com.company.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OutputProduct {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    private Product product;
    @Column(nullable=false)
    private long amount;
    @Column(nullable=false)
    private double price;
    @ManyToOne
    private Output output;
}
