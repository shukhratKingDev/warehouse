package com.company.warehouse.repository;

import com.company.warehouse.entity.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list")
public interface OutputProductRepository extends JpaRepository<OutputProduct, UUID> {
}
